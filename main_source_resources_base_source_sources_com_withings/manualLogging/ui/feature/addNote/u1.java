package com.withings.manualLogging.ui.feature.addNote;
/* compiled from: SelectManualLogCategoryScreen.kt */
/* loaded from: classes4.dex */
public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f41595a = new s1.a(false, 747056762, a.f41596a);

    /* compiled from: SelectManualLogCategoryScreen.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f41596a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
            s0.b item = bVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(item, "$this$item");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                r0.d0.a(androidx.compose.foundation.layout.e1.f(androidx.compose.ui.e.f8927a, yk.h.B()), aVar2);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SelectManualLogCategoryScreen.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f41597a = new kotlin.jvm.internal.w(2);

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
