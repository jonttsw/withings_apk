package com.withings.device.setup.ui.activity;

import androidx.compose.material3.ga;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r0.a0;
import ym0.q;
/* compiled from: InitScreen.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f37509a = new s1.a(false, 1334428554, a.f37510a);

    /* compiled from: InitScreen.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements q<a0, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f37510a = new w(3);

        @Override // ym0.q
        public final y invoke(a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            a0 Button = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(Button, "$this$Button");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                ga.b("Next", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 6, 0, 131070);
            }
            return y.f85009a;
        }
    }
}
