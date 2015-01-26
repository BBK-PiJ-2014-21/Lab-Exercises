package e04_testImplementationsOfInterface;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;

import queues.*;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * JUnit test for interface PersonQueue (Day 8, package queues)
 */
@RunWith(Parameterized.class)
public class TestQueue {
    private PersonQueue queue;

    public TestQueue(PersonQueue queue) {
        this.queue = queue;
    }

    /**
     * Testing three queue implementations from Day 8:
     * (PersonQueueLinkedListImpl, PersonQueueOldestImpl, PersonQueuePriorityListImpl).
     */
    @Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                {new PersonQueueLinkedListImpl()},
                {new PersonQueueOldestImpl()},
                {new PersonQueuePriorityListImpl()},

        });
    }

    /**
     * Testing retrieve() on empty queue: any implementations should pass it.
     * RESULT: all three implementations passed the test.
     */
    public String errorMessage() {
        return queue + " failed.";
    }

    @Test
    public void testEmptyRetrieve() {
        assertNull(queue.retrieve());
    }

    /**
     * Testing a retrieve() on empty queue: any implementation should pass it.
     * RESULT: all three implementations passed it.
     */
    @Test
    public void emptyRetrieve() {
        assertNull(errorMessage(), queue.retrieve());
    }

    /**
     * Testing one insert() and retrieve(): any implementation should pass it.
     * RESULT: all three implementations passed it (please note this is a sort of a false positive
     * for a queue which doesn't allow under 16th, it's null because it has always been empty,
     * not because it actually did an insert() and retrieve(): see next test.
     */
    @Test
    public void insertAndRetrieveCheckNull() {
        Person first = new Person("OneAndOnly", 15);
        queue.insert(first);
        queue.retrieve();
        assertNull(errorMessage(), queue.retrieve());
    }

    /**
     * Testing one insert() and one retrieve(): any implementation should pass it.
     * (apart from a restricted queue which doesn't let under 16th in)
     * RESULT: PersonQueuePriorityListImpl failed (it's an over-18 queue,
     * so getName() threw a NullPointerException), the other two passed.
     */
    @Test
    public void insertAndRetrieveCheckName() {
        Person first = new Person("OneAndOnly", 15);
        queue.insert(first);
        assertEquals(errorMessage(), queue.retrieve().getName(), "OneAndOnly");
    }

    /**
     * Testing two insert() of the same age, one retrieve(): any implementation should pass it.
     * RESULT: all the implementations passed it.
     */
    @Test
    public void twoInsertOneRetrieve() {
        Person first = new Person("First", 33);
        Person second = new Person("Second", 33);
        queue.insert(first);
        queue.insert(second);
        assertEquals(errorMessage(), queue.retrieve().getName(), "First");
    }

    /**
     * Testing two insert() of different age (older is late in): only standard FIFO should pass it.
     * RESULT: only PersonQueueLinkedListImpl passed the test (being a FIFO), the other two
     * failed as they retrieve the oldest Person first.
     */
    @Test
    public void twoInsertOneRetrieveFIFO() {
        Person first = new Person("EarlyBird", 20);
        Person second = new Person("LateOldMan", 99);
        queue.insert(first);
        queue.insert(second);
        assertEquals(errorMessage(), queue.retrieve().getAge(), 20);
    }

}