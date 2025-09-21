
//When you pass an object, Java still passes it "by value"
//but the "value" is the reference (memory address) of the Object
//Inside the method , you receive a copy of that reference.
//Any "mutation/updating" of the object itself will be seen
//by the caller, because both the caller and the method are
//talking to the "same object in memory"

class Box extends Object{
    int size;

    Box(int size){
        this.size = size;
    }
}

