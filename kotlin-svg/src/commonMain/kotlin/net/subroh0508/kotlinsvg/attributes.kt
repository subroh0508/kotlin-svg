package net.subroh0508.kotlinsvg

import kotlinx.css.WhiteSpace
import kotlinx.html.attributes.*

object IntEncoder : AttributeEncoder<Int> {
    override fun encode(attributeName: String, value: Int): String = value.toString()
    override fun decode(attributeName: String, value: String): Int = value.toInt()
}

class EnumEncoder<T : Enum<*>>(val valuesMap : Map<String, T>) : AttributeEncoder<T> {
    override fun encode(attributeName: String, value: T): String = value.toString()
    override fun decode(attributeName: String, value: String): T = valuesMap[value] ?: throw IllegalArgumentException("Unknown value $value for $attributeName")
}

internal val whiteSpaceEnumValues = WhiteSpace.values().associateBy { it.toString() }

class IntAttribute : Attribute<Int>(IntEncoder)

class EnumAttribute<T : Enum<*>>(values : Map<String, T>) : Attribute<T>(EnumEncoder(values))

internal val attributeStringString : Attribute<String> = StringAttribute()

internal val attributeSetStringStringSet : Attribute<Set<String>> = StringSetAttribute()

internal val attributeBooleanBoolean : Attribute<Boolean> = BooleanAttribute()

internal val attributeBooleanTicker : Attribute<Boolean> = TickerAttribute()

internal val attributeIntInt: Attribute<Int> = IntAttribute()

internal val attributeWhiteSpaceEnumWhiteSpaceValues: Attribute<WhiteSpace> = EnumAttribute(whiteSpaceEnumValues)
