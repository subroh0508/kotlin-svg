package net.subroh0508.kotlinsvg.attributes

import kotlinx.css.WhiteSpace
import kotlinx.html.Tag
import net.subroh0508.kotlinsvg.attributeIntInt
import net.subroh0508.kotlinsvg.attributeSetStringStringSet
import net.subroh0508.kotlinsvg.attributeStringString
import net.subroh0508.kotlinsvg.attributeWhiteSpaceEnumWhiteSpaceValues

/* Ref. https://www.w3.org/TR/SVG2/struct.html#CommonAttributes */

interface CommonAttributes : Tag

var CommonAttributes.classes: Set<String>
    get() = attributeSetStringStringSet[this, "class"]
    set(newValue) { attributeSetStringStringSet[this, "class"] = newValue }

var CommonAttributes.id: String
    get() = attributeStringString[this, "id"]
    set(newValue) { attributeStringString[this, "id"] = newValue }

var CommonAttributes.lang: String
    get() = attributeStringString[this, "lang"]
    set(newValue) { attributeStringString[this, "lang"] = newValue }

var CommonAttributes.whiteSpace: WhiteSpace
    get() = attributeWhiteSpaceEnumWhiteSpaceValues[this, "white-space"]
    set(newValue) { attributeWhiteSpaceEnumWhiteSpaceValues[this, "white-space"] = newValue }

var CommonAttributes.style: String
    get() = attributeStringString[this, "style"]
    set(newValue) { attributeStringString[this, "style"] = newValue }

var CommonAttributes.tabIndex: Int
    get() = attributeIntInt[this, "tabindex"]
    set(newValue) { attributeIntInt[this, "tabindex"] = newValue }


