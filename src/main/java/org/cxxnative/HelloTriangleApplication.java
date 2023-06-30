package org.cxxnative;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

@Platform(include ="JavaWorks.h")
public class HelloTriangleApplication extends Pointer {

    static { Loader.load(); }
    public HelloTriangleApplication() { allocate(); }

    public void start_demo(){
        run();
    }

    private native void allocate();

    /*
    public native void move(float amount, boolean x, boolean y, boolean z);
    public native void rotate(float angle, boolean x, boolean y, boolean z);
    public native void scale(float amount, boolean x, boolean y, boolean z);
    */
    public native void run();
}
