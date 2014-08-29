package com.github.zxh.classpy.classfile.datatype;

import com.github.zxh.classpy.classfile.ClassComponent;
import com.github.zxh.classpy.classfile.ClassReader;
import com.github.zxh.classpy.common.IntValue;

/**
 * Unsigned one-byte quantity.
 * 
 * @author zxh
 */
public class U1 extends ClassComponent implements IntValue {

    private int value;
    
    @Override
    public int getValue() {
        return value;
    }
    
    @Override
    protected void readContent(ClassReader reader) {
        byte b = reader.getByteBuffer().get();
        value = Byte.toUnsignedInt(b);
        describe(value, reader);
    }
    
    protected void describe(int value, ClassReader reader) {
        setDesc(String.valueOf(value));
    }
    
}