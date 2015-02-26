// 6. More on points

Point origin = new Point()
origin.x = 0.0
origin.y = 0.0
Point twoThree = new Point()
twoThree.x = 2.0
twoThree.y = 3.0
Point minusOneZero = new Point()
minusOneZero.x = -1.0
minusOneZero.y = 0.0
println("distance of (0,0) to (2,3) = " + origin.distanceTo(twoThree))
println("distance of (2,3) to origin = " + twoThree.distanceToOrigin())
twoThree.moveTo(origin)
println("distance of (2,3) moved to origin to (0,0) =  " + twoThree.distanceTo(origin))
originClone = origin.clone()
println("distance of (-1,0) to (0,0) cloned = " + minusOneZero.distanceTo(originClone))
println("distance of opposite of (-1,0) to (0,0) = " + minusOneZero.opposite().distanceTo(origin))
origin.moveTo(3,3) 
println("distance of (0,0) moved to (3,3) from (0,0) cloned = " + origin.distanceTo(originClone))