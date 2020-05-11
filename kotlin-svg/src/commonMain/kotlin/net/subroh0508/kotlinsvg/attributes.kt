package net.subroh0508.kotlinsvg

import kotlinx.css.*
import kotlinx.css.properties.TextDecoration
import kotlinx.css.properties.TextDecorationLine
import kotlinx.html.attributes.*

object IntEncoder : AttributeEncoder<Int> {
    override fun encode(attributeName: String, value: Int): String = value.toString()
    override fun decode(attributeName: String, value: String): Int = value.toInt()
}

object FloatEncoder : AttributeEncoder<kotlin.Float> {
    override fun encode(attributeName: String, value: kotlin.Float): String = value.toString()
    override fun decode(attributeName: String, value: String): kotlin.Float = value.toFloat()
}

class EnumEncoder<T : Enum<*>>(val valuesMap : Map<String, T>) : AttributeEncoder<T> {
    override fun encode(attributeName: String, value: T): String = value.toString()
    override fun decode(attributeName: String, value: String): T = valuesMap[value] ?: throw IllegalArgumentException("Unknown value $value for $attributeName")
}

/*
object ClipPathEncoder : AttributeEncoder<ClipPath> {
    override fun encode(attributeName: String, value: ClipPath): String = value.toString()
    override fun decode(attributeName: String, value: String): ClipPath = ClipPath(value)
}
*/

object ColorEncoder : AttributeEncoder<Color> {
    override fun encode(attributeName: String, value: Color): String = value.toString()
    override fun decode(attributeName: String, value: String): Color = Color(value)
}

/*
object FontVariantsEncoder : AttributeEncoder<FontVariants> {
    override fun encode(attributeName: String, value: FontVariants): String = value.toString()
    override fun decode(attributeName: String, value: String): FontVariants = FontVariants(value)
}
*/

/*
object FilterEncoder : AttributeEncoder<Filter> {
    override fun encode(attributeName: String, value: Filter): String = value.toString()
    override fun decode(attributeName: String, value: String): Filter = Filter(value)
}
*/

object FontStyleEncoder : AttributeEncoder<FontStyle> {
    override fun encode(attributeName: String, value: FontStyle): String = value.toString()
    override fun decode(attributeName: String, value: String): FontStyle = FontStyle(value)
}

object FontWeightEncoder : AttributeEncoder<FontWeight> {
    override fun encode(attributeName: String, value: FontWeight): String = value.toString()
    override fun decode(attributeName: String, value: String): FontWeight = FontWeight(value)
}

object LinearDimensionEncoder : AttributeEncoder<LinearDimension> {
    override fun encode(attributeName: String, value: LinearDimension): String = value.toString()
    override fun decode(attributeName: String, value: String): LinearDimension = LinearDimension(value)
}

/*
object MarkerEncoder : AttributeEncoder<Marker> {
    override fun encode(attributeName: String, value: Marker): String = value.toString()
    override fun decode(attributeName: String, value: String): Marker = Marker(value)
}
*/

/*
object MaskEncoder : AttributeEncoder<Mask> {
    override fun encode(attributeName: String, value: Mask): String = value.toString()
    override fun decode(attributeName: String, value: String): Mask = Mask(value)
}
*/

/*
object StrokeDashArrayEncoder : AttributeEncoder<StrokeDashArray> {
    override fun encode(attributeName: String, value: StrokeDashArray): String = value.toString()
    override fun decode(attributeName: String, value: String): StrokeDashArray = StrokeDashArray(value)
}
*/

object TextDecorationEncoder : AttributeEncoder<TextDecoration> {
    private val textDecorationLineEnumValues = TextDecorationLine.values().associateBy { it.toString() }

    override fun encode(attributeName: String, value: TextDecoration): String = value.toString()
    override fun decode(attributeName: String, value: String): TextDecoration = TextDecoration(stringSetDecode(value)?.mapNotNull { textDecorationLineEnumValues[it] }?.toSet() ?: setOf())
}

// internal val alignmentBaselineEnumValues = AlignmentBaseline.values().associateBy { it.toString() }
// internal val baselineShiftEnumValues = BaselineShift.values().associateBy { it.toString() }
internal val clipRuleEnumValues = ClipRule.values().associateBy { it.toString() }
internal val colorInterpolationEnumValues = ColorInterpolation.values().associateBy { it.toString() }
internal val colorInterpolationFiltersEnumValues = ColorInterpolationFilters.values().associateBy { it.toString() }
internal val cursorEnumValues = Cursor.values().associateBy { it.toString() }
internal val directionEnumValues = Direction.values().associateBy { it.toString() }
internal val displayEnumValues = Display.values().associateBy { it.toString() }
// internal val dominantBaselineValues = DominantBaseline.values.associateBy { it.toString() }
internal val fillRuleEnumValues = FillRule.values().associateBy { it.toString() }
// internal val fontStretchEnumValues = FontStretch.values().associateBy { it.toString() }
internal val imageRenderingEnumValues = ImageRendering.values().associateBy { it.toString() }
internal val overflowEnumValues = Overflow.values().associateBy { it.toString() }
internal val pointerEventsEnumValues = PointerEvents.values().associateBy { it.toString() }
internal val shapeRenderingEnumValues = ShapeRendering.values().associateBy { it.toString() }
internal val strokeLinecapEnumValues = StrokeLinecap.values().associateBy { it.toString() }
internal val strokeLinejoinEumValues = StrokeLinejoin.values().associateBy { it.toString() }
internal val textAnchorEnumValues = TextAnchor.values().associateBy { it.toString() }
internal val textOverflowEnumValues = TextOverflow.values().associateBy { it.toString() }
// internal val textRenderingEnumValues = TextRendering.values().associateBy { it.toString() }
// internal val unicodeBidiEnumValues = UnicodeBidi.values().associateBy { it.toString() }
internal val vectorEffectEnumValues = VectorEffect.values().associateBy { it.toString() }
internal val visibilityEnumValues = Visibility.values().associateBy { it.toString() }
internal val whiteSpaceEnumValues = WhiteSpace.values().associateBy { it.toString() }
// internal val writingModeEnumValues = WritingMode.values().associateBy { it.toString() }

class IntAttribute : Attribute<Int>(IntEncoder)

class FloatAttribute : Attribute<kotlin.Float>(FloatEncoder)

class EnumAttribute<T : Enum<*>>(values : Map<String, T>) : Attribute<T>(EnumEncoder(values))

// class ClipPathAttribute : Attribute<ClipPath>(ClipPathEncoder)

class ColorAttribute : Attribute<Color>(ColorEncoder)

// class FilterAttribute : Attribute<Filter>(FilterEncoder)

// class FontVariantsAttribute : Attribute<LinearDimension>(FontVariantsEncoder)

class FontStyleAttribute : Attribute<FontStyle>(FontStyleEncoder)

class FontWeightAttribute : Attribute<FontWeight>(FontWeightEncoder)

class LinearDimensionAttribute : Attribute<LinearDimension>(LinearDimensionEncoder)

// class MarkerAttribute : Attribute<Marker>(MarkerEncoder)

// class MaskAttribute : Attribute<Marker>(MaskEncoder)

// class StrokeDashArrayAttribute : Attribute<StrokeDashArray>(StrokeDashArrayEncoder)

class TextDecorationAttribute : Attribute<TextDecoration>(TextDecorationEncoder)

internal val attributeStringString : Attribute<String> = StringAttribute()

internal val attributeSetStringStringSet : Attribute<Set<String>> = StringSetAttribute()

internal val attributeBooleanBoolean : Attribute<Boolean> = BooleanAttribute()

internal val attributeBooleanTicker : Attribute<Boolean> = TickerAttribute()

internal val attributeIntInt: Attribute<Int> = IntAttribute()

internal val attributeFloatFloat: Attribute<kotlin.Float> = FloatAttribute()

// internal val attributeClipPathClipPathValues: ClipPathAttribute = ClipPathAttribute()

internal val attributeColorColorValues: ColorAttribute = ColorAttribute()

// internal val attributeFilterFilterValues: FilterAttribute = FilterAttribute()

// internal val attributeFontVariantsFontVariantsValues: FontVariantsAttribute = FontVariantsAttribute()

internal val attributeFontStyleFontStyleValues: FontStyleAttribute = FontStyleAttribute()

internal val attributeFontWeightFontWeightValues: FontWeightAttribute = FontWeightAttribute()

internal val attributeLinearDimensionLinearDimensionValues: LinearDimensionAttribute = LinearDimensionAttribute()

// internal val attributeMarkerMakerValues: MarkerAttribute = MarkerAttribute()

// internal val attributeMaskMaskValues: MaskAttribute = MaskAttribute()

// internal val attributeStrokeDashArrayValues: StrokeDashArrayAttribute = StrokeDashArrayAttribute()

internal val attributeTextDecorationValues: TextDecorationAttribute = TextDecorationAttribute()

// internal val attributeAlignmentBaselineEnumAlignmentBaselineValues: Attribute<AlignmentBaseline> = EnumAttribute(alignmentBaselineEnumValues)

// internal val attributeBaselineShiftEnumBaselineShiftValues: Attribute<BaselineShift> = EnumAttribute(baselineShiftEnumValues)

internal val attributeClipRuleEnumClipRuleValues: Attribute<ClipRule> = EnumAttribute(clipRuleEnumValues)

internal val attributeColorInterpolationEnumColorInterpolationValues: Attribute<ColorInterpolation> = EnumAttribute(colorInterpolationEnumValues)

internal val attributeColorInterpolationFiltersEnumColorInterpolationFiltersValues: Attribute<ColorInterpolationFilters> = EnumAttribute(colorInterpolationFiltersEnumValues)

internal val attributeCursorEnumCursorValues: Attribute<Cursor> = EnumAttribute(cursorEnumValues)

internal val attributeDirectionEnumDirectionValues: Attribute<Direction> = EnumAttribute(directionEnumValues)

internal val attributeDisplayEnumDisplayValues: Attribute<Display> = EnumAttribute(displayEnumValues)

// internal val attributeDominantBaselineEnumDominantBaselineValues: Attribute<Direction> = EnumAttribute(dominantBaselineEnumValues)

internal val attributeFillRuleEnumFillRuleValues: Attribute<FillRule> = EnumAttribute(fillRuleEnumValues)

// internal val attributeFontStretchEnumFontStretchValues: Attribute<FontStretch> = EnumAttribute(fontStretchEnumValues)

internal val attributeImageRenderingEnumImageRenderingValues: Attribute<ImageRendering> = EnumAttribute(imageRenderingEnumValues)

internal val attributeOverflowEnumOverflowValues: Attribute<Overflow> = EnumAttribute(overflowEnumValues)

internal val attributePointerEventsEnumPointerEventsValues: Attribute<PointerEvents> = EnumAttribute(pointerEventsEnumValues)

internal val attributeShapeRenderingEnumShapeRenderingValues: Attribute<ShapeRendering> = EnumAttribute(shapeRenderingEnumValues)

internal val attributeStrokeLinecapEnumStrokeLinecapValues: Attribute<StrokeLinecap> = EnumAttribute(strokeLinecapEnumValues)

internal val attributeStrokeLinejoinEnumStrokeLinejoinValues: Attribute<StrokeLinejoin> = EnumAttribute(strokeLinejoinEumValues)

internal val attributeTextAnchorEnumTextAnchorValues: Attribute<TextAnchor> = EnumAttribute(textAnchorEnumValues)

internal val attributeTextOverflowEnumTextOverflowValues: Attribute<TextOverflow> = EnumAttribute(textOverflowEnumValues)

// internal val attributeTextRenderingEnumTextRenderingValues: Attribute<TextRendering> = EnumAttribute(textRenderingValues)

// internal val attributeUnicodeBidiEnumUnicodeBidiValues: Attribute<UnicodeBidi> = EnumAttribute(unicodeBidiEnumValues)

internal val attributeVectorEffectEnumVectorEffectValues: Attribute<VectorEffect> = EnumAttribute(vectorEffectEnumValues)

internal val attributeVisibilityEnumVisibilityValues: Attribute<Visibility> = EnumAttribute(visibilityEnumValues)

internal val attributeWhiteSpaceEnumWhiteSpaceValues: Attribute<WhiteSpace> = EnumAttribute(whiteSpaceEnumValues)

// internal val attributeWritingModeEnumWritingModeValues: Attribute<WritingMode> = EnumAttribute(writingModeEnumValues)
