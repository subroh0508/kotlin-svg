package net.subroh0508.kotlinsvg.attributes

import kotlinx.css.*
import kotlinx.html.Tag
import net.subroh0508.kotlinsvg.*
import net.subroh0508.kotlinsvg.attributeLinearDimensionLinearDimensionValues
import net.subroh0508.kotlinsvg.attributeTextAnchorEnumTextAnchorValues
import net.subroh0508.kotlinsvg.attributeTextOverflowEnumTextOverflowValues
import net.subroh0508.kotlinsvg.attributeWhiteSpaceEnumWhiteSpaceValues
import kotlin.Float

/* ref. https://www.w3.org/TR/SVG2/text.html#TextProperties */

interface PresentationAttributes : Tag

/*
var PresentationAttributes.alignmentBaseline: AlignmentBaseline
    get() = attributeAlignmentBaselineEnumAlignmentBaselineValues[this, "alignment-baseline"]
    set(newValue) { attributeAlignmentBaselineEnumAlignmentBaselineValues[this, "alignment-baseline"] = newValue }
*/

/*
var PresentationAttributes.baselineShift: BaselineShift
    get() = attributeBaselineShiftEnumBaselineShiftValues[this, "baseline-shift"]
    set(newValue) { attributeBaselineShiftEnumBaselineShiftValues[this, "baseline-shift"] = newValue }
*/

/*
var PresentationAttributes.clipPath: ClipPath
    get() = attributeClipPathClipPathValues[this, "clip-path"]
    set(newValue) { attributeClipPathClipPathValues[this, "clip-path"] = newValue }
*/

var PresentationAttributes.clipRule: ClipRule
    get() = attributeClipRuleEnumClipRuleValues[this, "clip-rule"]
    set(newValue) { attributeClipRuleEnumClipRuleValues[this, "clip-rule"] = newValue }
var PresentationAttributes.color: Color
    get() = attributeColorColorValues[this, "color"]
    set(newValue) { attributeColorColorValues[this, "color"] = newValue }
var PresentationAttributes.colorInterpolation: ColorInterpolation
    get() = attributeColorInterpolationEnumColorInterpolationValues[this, "color-interpolation"]
    set(newValue) { attributeColorInterpolationEnumColorInterpolationValues[this, "color-interpolation"] = newValue }
var PresentationAttributes.colorInterpolationFilters: ColorInterpolationFilters
    get() = attributeColorInterpolationFiltersEnumColorInterpolationFiltersValues[this, "color-interpolation-filters"]
    set(newValue) { attributeColorInterpolationFiltersEnumColorInterpolationFiltersValues[this, "color-interpolation-filters"] = newValue }
var PresentationAttributes.cursor: Cursor
    get() = attributeCursorEnumCursorValues[this, "cursor"]
    set(newValue) { attributeCursorEnumCursorValues[this, "cursor"] = newValue }
var PresentationAttributes.direction: Direction
    get() = attributeDirectionEnumDirectionValues[this, "direction"]
    set(newValue) { attributeDirectionEnumDirectionValues[this, "direction"] = newValue }
var PresentationAttributes.display: Display
    get() = attributeDisplayEnumDisplayValues[this, "display"]
    set(newValue) { attributeDisplayEnumDisplayValues[this, "display"] = newValue }
/*
var PresentationAttributes.dominantBaseline: DominantBaseline
    get() = attributeDominantBaselineEnumDominantBaselineValues[this, "dominant-baseline"]
    set(newValue) { attributeDominantBaselineEnumDominantBaselineValues[this, "dominant-baseline"] = newValue }
*/
var PresentationAttributes.fillOpacity: Float
    get() = attributeFloatFloat[this, "fill-opacity"]
    set(newValue) { attributeFloatFloat[this, "fill-opacity"] = newValue }
var PresentationAttributes.fillRule: FillRule
    get() = attributeFillRuleEnumFillRuleValues[this, "fill-rule"]
    set(newValue) { attributeFillRuleEnumFillRuleValues[this, "fill-rule"] = newValue }
/*
var PresentationAttributes.filter: Filter
    get() = attributeFilterFilterValues[this, "filter"]
    set(newValue) { attributeFilterFilterValues[this, "filter"] = newValue }
*/
var PresentationAttributes.floodColor: Color
    get() = attributeColorColorValues[this, "flood-color"]
    set(newValue) { attributeColorColorValues[this, "flood-color"] = newValue }
var PresentationAttributes.floodOpacity: Float
    get() = attributeFloatFloat[this, "flood-opacity"]
    set(newValue) { attributeFloatFloat[this, "flood-opacity"] = newValue }
var PresentationAttributes.fontFamily: String
    get() = attributeStringString[this, "font-family"]
    set(newValue) { attributeStringString[this, "font-family"] = newValue }
var PresentationAttributes.fontSize: LinearDimension
    get() = attributeLinearDimensionLinearDimensionValues[this, "font-size"]
    set(newValue) { attributeLinearDimensionLinearDimensionValues[this, "font-size"] = newValue }
var PresentationAttributes.fontSizeAdjust: Float
    get() = attributeFloatFloat[this, "font-size-adjust"]
    set(newValue) { attributeFloatFloat[this, "font-size-adjust"] = newValue }
/*
var PresentationAttributes.fontStretch: FontStretch
    get() = attributeFontStretchEnumFontStretchValues[this, "font-stretch"]
    set(newValue) { attributeFontStretchEnumFontStretchValues[this, "font-stretch"] = newValue }
*/
var PresentationAttributes.fontStyle: FontStyle
    get() = attributeFontStyleFontStyleValues[this, "font-style"]
    set(newValue) { attributeFontStyleFontStyleValues[this, "font-style"] = newValue }
/*
var PresentationAttributes.fontVariant: FontVariants
    get() = attributeFontVariantsFontVariantsValues[this, "font-variant"]
    set(newValue) { attributeFontVariantsFontVariantsValues[this, "font-variant"] = newValue }
*/
var PresentationAttributes.fontWeight: FontWeight
    get() = attributeFontWeightFontWeightValues[this, "font-weight"]
    set(newValue) { attributeFontWeightFontWeightValues[this, "font-weight"] = newValue }
var PresentationAttributes.image-rendering: String
    get() = [this, "image-rendering"]
    set(newValue) { [this, "image-rendering"] = newValue }
var PresentationAttributes.letterSpacing: LinearDimension
    get() = attributeLinearDimensionLinearDimensionValues[this, "letter-spacing"]
    set(newValue) { attributeLinearDimensionLinearDimensionValues[this, "letter-spacing"] = newValue }
var PresentationAttributes.lighting-color: String
    get() = [this, "lighting-color"]
    set(newValue) { [this, "lighting-color"] = newValue }
var PresentationAttributes.marker-end: String
    get() = [this, "marker-end"]
    set(newValue) { [this, "marker-end"] = newValue }
var PresentationAttributes.marker-mid: String
    get() = [this, "marker-mid"]
    set(newValue) { [this, "marker-mid"] = newValue }
var PresentationAttributes.marker-start: String
    get() = [this, "marker-start"]
    set(newValue) { [this, "marker-start"] = newValue }
var PresentationAttributes.mask: String
    get() = [this, "mask"]
    set(newValue) { [this, "mask"] = newValue }
var PresentationAttributes.opacity: String
    get() = [this, "opacity"]
    set(newValue) { [this, "opacity"] = newValue }
var PresentationAttributes.overflow: String
    get() = [this, "overflow"]
    set(newValue) { [this, "overflow"] = newValue }
var PresentationAttributes.paint-order: String
    get() = [this, "paint-order"]
    set(newValue) { [this, "paint-order"] = newValue }
var PresentationAttributes.pointer-events: String
    get() = [this, "pointer-events"]
    set(newValue) { [this, "pointer-events"] = newValue }
var PresentationAttributes.shape-rendering: String
    get() = [this, "shape-rendering"]
    set(newValue) { [this, "shape-rendering"] = newValue }
var PresentationAttributes.stop-color: String
    get() = [this, "stop-color"]
    set(newValue) { [this, "stop-color"] = newValue }
var PresentationAttributes.stop-opacity: String
    get() = [this, "stop-opacity"]
    set(newValue) { [this, "stop-opacity"] = newValue }
var PresentationAttributes.stroke: Color
    get() = attributeColorColorValues[this, "stroke"]
    set(newValue) { attributeColorColorValues[this, "stroke"] = newValue }
var PresentationAttributes.strokeDasharray: String
    get() = [this, "stroke-dasharray"]
    set(newValue) { [this, "stroke-dasharray"] = newValue }
var PresentationAttributes.strokeDashoffset: String
    get() = [this, "stroke-dashoffset"]
    set(newValue) { [this, "stroke-dashoffset"] = newValue }
var PresentationAttributes.strokeLinecap: String
    get() = [this, "stroke-linecap"]
    set(newValue) { [this, "stroke-linecap"] = newValue }
var PresentationAttributes.strokeLinejoin: String
    get() = [this, "stroke-linejoin"]
    set(newValue) { [this, "stroke-linejoin"] = newValue }
var PresentationAttributes.strokeMiterlimit: String
    get() = [this, "stroke-miterlimit"]
    set(newValue) { [this, "stroke-miterlimit"] = newValue }
var PresentationAttributes.strokeOpacity: String
    get() = [this, "stroke-opacity"]
    set(newValue) { [this, "stroke-opacity"] = newValue }
var PresentationAttributes.strokeWidth: String
    get() = [this, "stroke-width"]
    set(newValue) { [this, "stroke-width"] = newValue }
var PresentationAttributes.textAnchor: TextAnchor
    get() = attributeTextAnchorEnumTextAnchorValues[this, "text-anchor"]
    set(newValue) { attributeTextAnchorEnumTextAnchorValues[this, "text-anchor"] = newValue }
var PresentationAttributes.text-decoration: String
    get() = [this, "text-decoration"]
    set(newValue) { [this, "text-decoration"] = newValue }
var PresentationAttributes.textOverflow: TextOverflow
    get() = attributeTextOverflowEnumTextOverflowValues[this, "text-overflow"]
    set(newValue) { attributeTextOverflowEnumTextOverflowValues[this, "text-overflow"] = newValue }
var PresentationAttributes.text-rendering: String
    get() = [this, "text-rendering"]
    set(newValue) { [this, "text-rendering"] = newValue }
var PresentationAttributes.unicode-bidi: String
    get() = [this, "unicode-bidi"]
    set(newValue) { [this, "unicode-bidi"] = newValue }
var PresentationAttributes.vector-effect: String
    get() = [this, "vector-effect"]
    set(newValue) { [this, "vector-effect"] = newValue }
var PresentationAttributes.visibility: Visibility
    get() = attributeVisibilityEnumVisibilityValues[this, "visibility"]
    set(newValue) { attributeVisibilityEnumVisibilityValues[this, "visibility"] = newValue }
var CommonAttributes.whiteSpace: WhiteSpace
    get() = attributeWhiteSpaceEnumWhiteSpaceValues[this, "white-space"]
    set(newValue) { attributeWhiteSpaceEnumWhiteSpaceValues[this, "white-space"] = newValue }
var PresentationAttributes.wordSpacing: LinearDimension
    get() = attributeLinearDimensionLinearDimensionValues[this, "word-spacing"]
    set(newValue) { attributeLinearDimensionLinearDimensionValues[this, "word-spacing"] = newValue }
/*
var PresentationAttributes.writingMode: WritingMode
    get() = attributeWritingModeEnumWritingModeValues[this, "writing-mode"]
    set(newValue) { attributeWritingModeEnumWritingModeValues[this, "writing-mode"] = newValue }
*/
