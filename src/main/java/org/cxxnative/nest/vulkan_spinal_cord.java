package org.cxxnative.nest;

import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.*;

/*class vulkan_spinal_cord
{
    public:
    vulkan_spinal_cord(windowing::base_window_layout& window_layout) : connected_window_layout(window_layout){}


    void init_instance();
    void init()
    {
        init_debug();
        init_ph_device();
        init_devices();
    }

    //for later
    static bool is_device_suitable(VkPhysicalDevice phys_device);


    bool check_device_extension_support() const;
    void connect_window(windowing::base_window_layout& win, bool do_init);
    static std::vector<const char*> get_required_extensions();
    VkDevice& get_vk_device(){return device;}
    VkPhysicalDevice& get_vk_physical_device(){return ph_device;}
    VkInstance& get_vk_instance(){return instance;}
    VkSurfaceKHR& get_vk_surface(){return connected_window_layout.get_VK_surface();}
    windowing::base_window_layout& get_window_layout(){return connected_window_layout;}
    needed_queues_families get_queue_families(){return indices;}

    virtual ~vulkan_spinal_cord();
};

}*/

@Platform(include="vulkan_spinal_cord.h", link="spinal_cord")
@Namespace ("harpy::nest")
public class vulkan_spinal_cord extends Pointer {
    windowing window;

    public vulkan_spinal_cord(windowing win){
        window = win;
    }


}
