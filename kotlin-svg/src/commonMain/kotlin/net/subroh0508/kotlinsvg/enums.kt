@file:Suppress("EnumEntryName")

package net.subroh0508.kotlinsvg

enum class ClipRule {
    nonzero, evenodd
}

enum class ColorInterpolation {
    auto, sRGB, linearRGB
}

enum class ColorInterpolationFilters {
    auto, sRGB, linearRGB
}

enum class FillRule {
    nonzero, evenodd
}

enum class ImageRendering {
    auto, optimizeSpeed, optimizeQuality
}

enum class ShapeRendering {
    auto, optimizeSpeed, crispEdges, geometricPrecision
}

enum class StrokeLinecap {
    butt, round, square, inherit
}

enum class StrokeLinejoin {
    miter, `miter-clip`, round, bevel, arcs
}

enum class TextAnchor {
    start, middle, end
}

enum class VectorEffect {
    none, `non-scaling-stroke`, `non-scaling-size`, `non-rotation`, `fixed-position`
}
