package com.withings.common.compose.component;

import java.util.List;
/* compiled from: ScrollableTabRow.kt */
/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f34478a = new s1.a(false, 886872507, a.f34480a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f34479b = new s1.a(false, 1813037059, b.f34481a);

    /* compiled from: ScrollableTabRow.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<List<? extends s4>, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34480a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(List<? extends s4> list, androidx.compose.runtime.a aVar, Integer num) {
            List<? extends s4> it = list;
            num.intValue();
            kotlin.jvm.internal.u.j(it, "it");
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ScrollableTabRow.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34481a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            }
            return nm0.y.f85009a;
        }
    }
}
