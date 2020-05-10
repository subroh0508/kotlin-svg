package net.subroh0508.kotlinsvg.attributes

import kotlinx.html.Tag
import net.subroh0508.kotlinsvg.attributeSetStringStringSet
import net.subroh0508.kotlinsvg.attributeStringString

/* Ref. https://www.w3.org/TR/SVG2/struct.html#ConditionalProcessingDefinitions */

interface ConditionalAttributes : Tag

var ConditionalAttributes.requiredExtensions: Set<String>
    get() = attributeSetStringStringSet[this, "requiredExtensions"]
    set(newValue) { attributeSetStringStringSet[this, "requiredExtensions"] = newValue }

var ConditionalAttributes.systemLanguage: String
    get() = attributeStringString[this, "systemLanguage"]
    set(newValue) { attributeStringString[this, "systemLanguage"] = newValue }
