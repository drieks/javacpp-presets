// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Softmax backward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class softmax_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public softmax_backward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public softmax_backward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public softmax_backward position(long position) {
        return (softmax_backward)super.position(position);
    }

    /** Descriptor for a softmax backward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public desc position(long position) {
            return (desc)super.position(position);
        }
    
        public native @ByRef dnnl_softmax_desc_t data(); public native desc data(dnnl_softmax_desc_t setter);

        /** Default constructor. Produces an empty object. */
        
        ///
        ///
        ///
        public desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a descriptor for a softmax backward propagation
         *  primitive.
         * 
         *  Inputs:
         *   - dst (#dnnl::primitive_desc_base::dst_desc (0))
         *   - diff_dst (#dnnl::primitive_desc_base::diff_dst_desc (0))
         * 
         *  Outputs:
         *   - diff_src (#dnnl::primitive_desc_base::diff_src_desc (0))
         * 
         *  @param diff_data_desc Diff source and diff destination memory descriptor.
         *  @param data_desc Destination memory descriptor.
         *  @param softmax_axis Axis over which softmax is computed. */
        public desc(@Const @ByRef memory.desc diff_data_desc, @Const @ByRef memory.desc data_desc,
                        int softmax_axis) { super((Pointer)null); allocate(diff_data_desc, data_desc, softmax_axis); }
        private native void allocate(@Const @ByRef memory.desc diff_data_desc, @Const @ByRef memory.desc data_desc,
                        int softmax_axis);
    }

    /** Primitive descriptor for a softmax backward propagation primitive. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for a softmax backward
         *  propagation primitive.
         * 
         *  @param desc Descriptor for a softmax backward propagation
         *      primitive.
         *  @param engine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for a softmax forward
         *      propagation primitive. It is used as a hint for deciding which
         *      memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Const @ByRef softmax_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, engine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Const @ByRef softmax_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Const @ByRef softmax_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, engine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Const @ByRef softmax_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for a softmax backward
         *  propagation primitive.
         * 
         *  @param desc Descriptor for a softmax backward propagation
         *      primitive.
         *  @param attr Primitive attributes to use.
         *  @param engine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for a softmax forward
         *      propagation primitive. It is used as a hint for deciding which
         *      memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine,
                        @Const @ByRef softmax_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, attr, engine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine,
                        @Const @ByRef softmax_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine,
                        @Const @ByRef softmax_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, engine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine,
                        @Const @ByRef softmax_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for a softmax backward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a softmax backward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal memory.desc dst_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_src_desc()const */
        public native @ByVal memory.desc diff_src_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal memory.desc diff_dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public softmax_backward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a softmax backward propagation primitive.
     *  @param pd Primitive descriptor for a softmax backward propagation
     *      primitive. */
    public softmax_backward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
