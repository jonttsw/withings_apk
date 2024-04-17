package com.withings.tutorials.ui;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.withings.common.compose.component.q5;
import com.withings.tutorials.ui.c;
/* compiled from: DeviceIntroductionActivity.kt */
/* loaded from: classes4.dex */
final class c extends kotlin.jvm.internal.w implements ym0.l<k1.w, k1.v> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.d0 f44712a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f44713b;

    /* compiled from: DeviceIntroductionActivity.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f44714a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f44714a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.lifecycle.d0 d0Var, Context context) {
        super(1);
        this.f44712a = d0Var;
        this.f44713b = context;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.tutorials.ui.b, androidx.lifecycle.c0] */
    @Override // ym0.l
    public final k1.v invoke(k1.w wVar) {
        k1.w DisposableEffect = wVar;
        kotlin.jvm.internal.u.j(DisposableEffect, "$this$DisposableEffect");
        final Context context = this.f44713b;
        ?? r32 = new androidx.lifecycle.b0() { // from class: com.withings.tutorials.ui.b
            @Override // androidx.lifecycle.b0
            public final void d(androidx.lifecycle.d0 d0Var, Lifecycle.Event event) {
                Context context2 = context;
                kotlin.jvm.internal.u.j(context2, "$context");
                if (c.a.f44714a[event.ordinal()] == 1) {
                    q5.a(context2);
                }
            }
        };
        androidx.lifecycle.d0 d0Var = this.f44712a;
        d0Var.getLifecycle().a(r32);
        return new d(d0Var, r32);
    }
}
