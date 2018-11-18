package net.println.kotlin.chapter2

/**
 * Created by benny on 2/26/17.
 */
val aBoolean: Boolean = true
val anotherBoolean: Boolean = false

val anInt: Int = 8
val anotherInt: Int = 0xFF              // 255
val moreInt: Int = 0b00000011           // 3
val maxInt: Int = Int.MAX_VALUE         // 2147483647
val minInt: Int = Int.MIN_VALUE         // -2147483648

val aLong: Long = 12368172397127391
val another: Long = 123
val maxLong: Long = Long.MAX_VALUE      // 9223372036854775807
val minLong: Long = Long.MIN_VALUE      // -9223372036854775808

val aFloat: Float = 2.0F                // 2.0
val anotherFloat: Float = 1E3f          // 1000.0
val maxFloat: Float = Float.MAX_VALUE   // 3.4028235E38
val minFloat: Float = -Float.MAX_VALUE  // -3.4028235E38

val aDouble: Double = 3.0
val anotherDouble: Double = 3.1415926
val maxDouble: Double= Double.MAX_VALUE // 1.7976931348623157E308
val minDouble: Double= -Double.MAX_VALUE// -1.7976931348623157E308

val aShort: Short = 127
val maxShort: Short = Short.MAX_VALUE   // 32767
val minShort: Short = Short.MIN_VALUE   // -32768

val maxByte: Byte = Byte.MAX_VALUE      // 127
val minByte: Byte = Byte.MIN_VALUE      // -128

fun main(args: Array<String>) {
    println(anotherInt)                 // 255
    println(moreInt)                    // 3

    println(maxInt)                     // 2147483647
    println(Math.pow(2.0, 31.0) - 1)    // 2.147483647E9
    println(minInt)                     // -2147483648
    println( - Math.pow(2.0, 31.0))     // -2.147483648E9

    println(maxLong)                    // 9223372036854775807
    println(Math.pow(2.0, 63.0) - 1)    // 9.223372036854776E18
    println(minLong)                    // -9223372036854775808
    println(- Math.pow(2.0, 63.0))      // -9.223372036854776E18

    println(aFloat)                     // 2.0
    println(anotherFloat)               // 1000.0
    println(maxFloat)                   // 3.4028235E38
    println(minFloat)                   // -3.4028235E38

    println(0.0f/0.0f == Float.NaN)     // false

    println(maxDouble)                  // 1.7976931348623157E308
    println(minDouble)                  // -1.7976931348623157E308

    println(maxShort)                   // 32767
    println(minShort)                   // -32768

    println(maxByte)                    // 127
    println(minByte)                    // -128
}