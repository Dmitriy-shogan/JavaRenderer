package org.cxxnative.nest;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.*;


/*namespace harpy::nest::windowing{

class hard_level_vulkan;
class base_window_layout
{
    friend hard_level_vulkan;
    GLFWwindow* glfw_window{nullptr};
    VkSurfaceKHR surface {nullptr};
    bool resized {false};

    void init_window();
    void init_surface(VkInstance& instance);

    public:

    GLFWwindow*& get_glfw_window();
    VkSurfaceKHR& get_VK_surface();
    void init_all(VkInstance& instance);


    base_window_layout() = default;

        ~base_window_layout();

    static void base_framebuffer_resize(GLFWwindow* window, int width, int height);
    bool& get_resize();
};


}*/
//TEMPORARILY base window layout, fully compitable and working base window not ready yet
@Platform(include="base_window_layout.h", link = "base_window_layout")
@Namespace("harpy::nest::windowing")
public class windowing {

    Pointer window_ptr;

    //Check for initialization
    boolean inited;

    public windowing(){};

    public native Pointer get_glfw_window();
    public native Pointer get_VK_surface();
    public native void init_all(Pointer instance);

    static public native void base_framebuffer_resize(Pointer window, int width, int height);
    public native boolean get_resize();

    public boolean is_inited(){return inited;}

}
