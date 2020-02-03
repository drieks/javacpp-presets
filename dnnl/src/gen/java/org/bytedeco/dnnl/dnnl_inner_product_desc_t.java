// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_layer_normalization
 <p>
 *  \addtogroup dnnl_api_inner_product
 *  \{
 <p>
 *  A descriptor of an inner product operation. */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_inner_product_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_inner_product_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_inner_product_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_inner_product_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_inner_product_desc_t position(long position) {
        return (dnnl_inner_product_desc_t)super.position(position);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     *  descriptor. Must be #dnnl_inner_product. */
    public native @Cast("dnnl_primitive_kind_t") int primitive_kind(); public native dnnl_inner_product_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #dnnl_forward_training,
     *  #dnnl_forward_inference, #dnnl_backward_data,
     *  #dnnl_backward_weights, and #dnnl_backward_bias. */
    public native @Cast("dnnl_prop_kind_t") int prop_kind(); public native dnnl_inner_product_desc_t prop_kind(int setter);
    /** Source memory descriptor. */
    public native @ByRef dnnl_memory_desc_t src_desc(); public native dnnl_inner_product_desc_t src_desc(dnnl_memory_desc_t setter);
    /** Source gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_src_desc(); public native dnnl_inner_product_desc_t diff_src_desc(dnnl_memory_desc_t setter);
    /** Weights memory descriptor. */
    public native @ByRef dnnl_memory_desc_t weights_desc(); public native dnnl_inner_product_desc_t weights_desc(dnnl_memory_desc_t setter);
    /** Weights gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_weights_desc(); public native dnnl_inner_product_desc_t diff_weights_desc(dnnl_memory_desc_t setter);
    /** Bias memory descriptor. */
    public native @ByRef dnnl_memory_desc_t bias_desc(); public native dnnl_inner_product_desc_t bias_desc(dnnl_memory_desc_t setter);
    /** Bias gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_bias_desc(); public native dnnl_inner_product_desc_t diff_bias_desc(dnnl_memory_desc_t setter);
    /** Destination memory descriptor. */
    public native @ByRef dnnl_memory_desc_t dst_desc(); public native dnnl_inner_product_desc_t dst_desc(dnnl_memory_desc_t setter);
    /** Destination gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_dst_desc(); public native dnnl_inner_product_desc_t diff_dst_desc(dnnl_memory_desc_t setter);
    /** The accumulator data type. Initialized automatically. */
    public native @Cast("dnnl_data_type_t") int accum_data_type(); public native dnnl_inner_product_desc_t accum_data_type(int setter);
}
