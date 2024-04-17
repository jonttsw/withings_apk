package com.withings.common.compose.component;

import x9.c;
/* compiled from: Avatar.kt */
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f33831a = new s1.a(false, -1713920762, a.f33833a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f33832b = new s1.a(false, 1542675296, b.f33834a);

    /* compiled from: Avatar.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.r<x9.r, c.b.C1857c, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33833a = new kotlin.jvm.internal.w(4);

        @Override // ym0.r
        public final nm0.y invoke(x9.r rVar, c.b.C1857c c1857c, androidx.compose.runtime.a aVar, Integer num) {
            x9.r SubcomposeAsyncImage = rVar;
            c.b.C1857c it = c1857c;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
            kotlin.jvm.internal.u.j(it, "it");
            if ((intValue & 641) == 128 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.foundation.layout.k.a(u5.c(androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a), true), aVar2, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Avatar.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.r<x9.r, c.b.d, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f33834a = new kotlin.jvm.internal.w(4);

        @Override // ym0.r
        public final nm0.y invoke(x9.r rVar, c.b.d dVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            x9.r SubcomposeAsyncImage = rVar;
            c.b.d it = dVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
            kotlin.jvm.internal.u.j(it, "it");
            if ((intValue & 14) == 0) {
                if (aVar2.K(SubcomposeAsyncImage)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 651) == 130 && aVar2.h()) {
                aVar2.C();
            } else {
                x9.p.c(SubcomposeAsyncImage, null, null, null, null, null, 0.0f, null, aVar2, intValue & 14, 127);
            }
            return nm0.y.f85009a;
        }
    }
}
