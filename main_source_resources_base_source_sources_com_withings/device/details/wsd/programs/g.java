package com.withings.device.details.wsd.programs;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.q;
import com.withings.alarm.model.WsdProgramElement;
import com.withings.device.details.wsd.programs.d;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import un.l;
import un.m;
/* compiled from: WsdViewHolderCategory.kt */
/* loaded from: classes3.dex */
public final class g extends l {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f37177c = 0;

    /* renamed from: a  reason: collision with root package name */
    private final tn.h f37178a;

    /* renamed from: b  reason: collision with root package name */
    private final d.a f37179b;

    /* compiled from: WsdViewHolderCategory.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f37180a;

        static {
            int[] iArr = new int[WsdProgramElement.CategoryType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37180a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(tn.h r3, com.withings.device.details.wsd.programs.d.a r4) {
        /*
            r2 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.u.j(r4, r0)
            android.widget.LinearLayout r0 = r3.a()
            java.lang.String r1 = "getRoot(...)"
            kotlin.jvm.internal.u.i(r0, r1)
            r2.<init>(r0)
            r2.f37178a = r3
            r2.f37179b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.wsd.programs.g.<init>(tn.h, com.withings.device.details.wsd.programs.d$a):void");
    }

    public static void b(g this$0, com.withings.alarm.model.a wsdProgramCategory) {
        u.j(this$0, "this$0");
        u.j(wsdProgramCategory, "$wsdProgramCategory");
        WsdProgramElement.CategoryType a11 = wsdProgramCategory.a();
        u.i(a11, "getCategoryType(...)");
        this$0.f37179b.Z(this$0, a11);
    }

    @Override // un.l
    public final void a(WsdProgramElement wsdProgramElement) {
        int i11;
        com.withings.alarm.model.a aVar = (com.withings.alarm.model.a) wsdProgramElement;
        tn.h hVar = this.f37178a;
        ((TextView) hVar.f100338c).setText(aVar.c(hVar.a().getContext()));
        ImageView overflow = (ImageView) hVar.f100339d;
        u.i(overflow, "overflow");
        if (aVar.d()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        overflow.setVisibility(i11);
        Context context = hVar.a().getContext();
        u.i(context, "getContext(...)");
        overflow.setImageDrawable(y70.a.a(2131231648, context, C1987R.color.light_alpha60));
        overflow.setOnClickListener(new m(hVar, aVar, this, 0));
        if (aVar.d()) {
            ((LinearLayout) hVar.f100337b).setOnClickListener(new q(hVar, 1));
        }
    }
}
