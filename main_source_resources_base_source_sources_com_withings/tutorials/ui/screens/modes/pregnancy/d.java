package com.withings.tutorials.ui.screens.modes.pregnancy;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.f5;
import androidx.compose.material.g6;
import androidx.compose.material3.g9;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.g;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.common.compose.component.ColorStyle;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod;
import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
import x1.b;
import x1.d;
/* compiled from: PregnancyMode.kt */
@SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f45852a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45854b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45855c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45856d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f45854b = aVar;
            this.f45855c = aVar2;
            this.f45856d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45856d | 1);
            ym0.a<nm0.y> aVar2 = this.f45854b;
            ym0.a<nm0.y> aVar3 = this.f45855c;
            d.this.a(aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45857a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<nm0.y> aVar) {
            super(2);
            this.f45857a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.pregnancy_mode_page_button_deactivation, aVar2), null, false, ColorStyle.f33323b, null, false, this.f45857a, aVar2, 24576, 109);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45859b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45860c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45861d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f45859b = aVar;
            this.f45860c = aVar2;
            this.f45861d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45861d | 1);
            ym0.a<nm0.y> aVar2 = this.f45859b;
            ym0.a<nm0.y> aVar3 = this.f45860c;
            d.this.b(aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* renamed from: com.withings.tutorials.ui.screens.modes.pregnancy.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0632d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45863b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f45864c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45865d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0632d(ym0.a<nm0.y> aVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, int i11) {
            super(2);
            this.f45863b = aVar;
            this.f45864c = pVar;
            this.f45865d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45865d | 1);
            ym0.a<nm0.y> aVar2 = this.f45863b;
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f45864c;
            d.this.c(aVar2, pVar, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f45866a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k1.r0<Boolean> r0Var) {
            super(0);
            this.f45866a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f45866a.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f45867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PregnancyModeViewModel f45868b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45869c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f45870d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CoroutineScope coroutineScope, PregnancyModeViewModel pregnancyModeViewModel, ym0.a<nm0.y> aVar, k1.r0<Boolean> r0Var) {
            super(0);
            this.f45867a = coroutineScope;
            this.f45868b = pregnancyModeViewModel;
            this.f45869c = aVar;
            this.f45870d = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            BuildersKt__Builders_commonKt.launch$default(this.f45867a, null, null, new com.withings.tutorials.ui.screens.modes.pregnancy.e(this.f45868b, this.f45869c, this.f45870d, null), 3, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PregnancyModeViewModel f45872b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45873c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45874d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45875e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f45876f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(PregnancyModeViewModel pregnancyModeViewModel, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11) {
            super(2);
            this.f45872b = pregnancyModeViewModel;
            this.f45873c = aVar;
            this.f45874d = aVar2;
            this.f45875e = aVar3;
            this.f45876f = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45876f | 1);
            ym0.a<nm0.y> aVar2 = this.f45874d;
            ym0.a<nm0.y> aVar3 = this.f45875e;
            d.this.d(this.f45872b, this.f45873c, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45877a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45878b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2) {
            super(2);
            this.f45877a = aVar;
            this.f45878b = aVar2;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string.pregnancy_mode_page_button_activation, aVar2);
                ColorStyle colorStyle = ColorStyle.f33322a;
                com.withings.common.compose.component.l.a(null, u11, null, false, colorStyle, null, false, this.f45877a, aVar2, 24576, 109);
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.not_now, aVar2), null, false, colorStyle, null, false, this.f45878b, aVar2, 24576, 109);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45880b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45881c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45882d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f45883e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11) {
            super(2);
            this.f45880b = aVar;
            this.f45881c = aVar2;
            this.f45882d = aVar3;
            this.f45883e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45883e | 1);
            ym0.a<nm0.y> aVar2 = this.f45881c;
            ym0.a<nm0.y> aVar3 = this.f45882d;
            d.this.e(this.f45880b, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45885b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i11) {
            super(2);
            this.f45885b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45885b | 1);
            d.this.f(aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.p<r8.m, r8.n, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PregnancyModeViewModel f45886a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45887b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45888c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f45889d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45890e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f45891f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ DateTime f45892g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45893h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, nm0.y> f45894i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ DueDateMethod f45895j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ym0.l<DueDateMethod, nm0.y> f45896k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ DateTime f45897l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f45898m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, nm0.y> f45899n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ DateTime f45900o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, nm0.y> f45901p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Double f45902q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ s60.a f45903r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45904s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(PregnancyModeViewModel pregnancyModeViewModel, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.l<? super String, nm0.y> lVar, ym0.a<nm0.y> aVar3, String str, DateTime dateTime, ym0.a<nm0.y> aVar4, ym0.l<? super DateTime, nm0.y> lVar2, DueDateMethod dueDateMethod, ym0.l<? super DueDateMethod, nm0.y> lVar3, DateTime dateTime2, String str2, ym0.l<? super DateTime, nm0.y> lVar4, DateTime dateTime3, ym0.l<? super DateTime, nm0.y> lVar5, Double d11, s60.a aVar5, ym0.a<nm0.y> aVar6) {
            super(2);
            this.f45886a = pregnancyModeViewModel;
            this.f45887b = aVar;
            this.f45888c = aVar2;
            this.f45889d = lVar;
            this.f45890e = aVar3;
            this.f45891f = str;
            this.f45892g = dateTime;
            this.f45893h = aVar4;
            this.f45894i = lVar2;
            this.f45895j = dueDateMethod;
            this.f45896k = lVar3;
            this.f45897l = dateTime2;
            this.f45898m = str2;
            this.f45899n = lVar4;
            this.f45900o = dateTime3;
            this.f45901p = lVar5;
            this.f45902q = d11;
            this.f45903r = aVar5;
            this.f45904s = aVar6;
        }

        @Override // ym0.p
        public final nm0.y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            kotlin.jvm.internal.u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            kotlin.jvm.internal.u.j(it, "it");
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "loading", null, null, null, null, null, null, com.withings.tutorials.ui.screens.modes.pregnancy.a.f45832a, 126);
            PregnancyModeViewModel pregnancyModeViewModel = this.f45886a;
            ym0.a<nm0.y> aVar = this.f45887b;
            ym0.a<nm0.y> aVar2 = this.f45888c;
            ym0.l<String, nm0.y> lVar = this.f45889d;
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "activation", null, null, null, null, null, null, new s1.a(true, 1138080245, new com.withings.tutorials.ui.screens.modes.pregnancy.h(pregnancyModeViewModel, aVar, aVar2, lVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "deactivation", null, null, null, null, null, null, new s1.a(true, 1022372470, new com.withings.tutorials.ui.screens.modes.pregnancy.j(aVar, lVar)), 126);
            xb.i.a(GuidedPresentationTutorialNavHost, "turnOffConfirmationBottomSheet", null, new s1.a(true, 98913723, new com.withings.tutorials.ui.screens.modes.pregnancy.k(this.f45890e, aVar)), 6);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "babyDue", null, null, null, null, null, null, new s1.a(true, 906664695, new m(this.f45891f, this.f45892g, this.f45887b, this.f45889d, this.f45893h, this.f45894i, this.f45888c)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "calculateDueDate", null, null, null, null, null, null, new s1.a(true, 790956920, new o(this.f45891f, this.f45895j, this.f45887b, this.f45889d, this.f45896k, this.f45888c)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "lastPeriod", null, null, null, null, null, null, new s1.a(true, 675249145, new q(this.f45891f, this.f45897l, this.f45898m, this.f45887b, this.f45889d, this.f45899n, this.f45888c)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "conceptionDate", null, null, null, null, null, null, new s1.a(true, 559541370, new s(this.f45891f, this.f45900o, this.f45887b, this.f45889d, this.f45901p, this.f45888c)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "weight", null, null, null, null, null, null, new s1.a(true, 443833595, new u(this.f45891f, this.f45902q, this.f45903r, this.f45887b, this.f45889d, this.f45904s, this.f45888c)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "disabledFeatures", null, null, null, null, null, null, new s1.a(true, 328125820, new w(aVar, aVar2, lVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "enabledFeature", null, null, null, null, null, null, new s1.a(true, 212418045, new com.withings.tutorials.ui.screens.modes.pregnancy.g(aVar, aVar2)), 126);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyMode.kt */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PregnancyModeViewModel f45906b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r8.n f45907c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f45908d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Double f45909e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ DateTime f45910f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ DateTime f45911g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ DateTime f45912h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ DueDateMethod f45913i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ s60.a f45914j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45915k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f45916l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45917m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45918n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, nm0.y> f45919o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, nm0.y> f45920p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, nm0.y> f45921q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ ym0.l<DueDateMethod, nm0.y> f45922r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45923s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45924t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ String f45925u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ String f45926v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f45927w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f45928x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f45929y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(PregnancyModeViewModel pregnancyModeViewModel, r8.n nVar, String str, Double d11, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DueDateMethod dueDateMethod, s60.a aVar, ym0.a<nm0.y> aVar2, ym0.l<? super String, nm0.y> lVar, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, ym0.l<? super DateTime, nm0.y> lVar2, ym0.l<? super DateTime, nm0.y> lVar3, ym0.l<? super DateTime, nm0.y> lVar4, ym0.l<? super DueDateMethod, nm0.y> lVar5, ym0.a<nm0.y> aVar5, ym0.a<nm0.y> aVar6, String str2, String str3, int i11, int i12, int i13) {
            super(2);
            this.f45906b = pregnancyModeViewModel;
            this.f45907c = nVar;
            this.f45908d = str;
            this.f45909e = d11;
            this.f45910f = dateTime;
            this.f45911g = dateTime2;
            this.f45912h = dateTime3;
            this.f45913i = dueDateMethod;
            this.f45914j = aVar;
            this.f45915k = aVar2;
            this.f45916l = lVar;
            this.f45917m = aVar3;
            this.f45918n = aVar4;
            this.f45919o = lVar2;
            this.f45920p = lVar3;
            this.f45921q = lVar4;
            this.f45922r = lVar5;
            this.f45923s = aVar5;
            this.f45924t = aVar6;
            this.f45925u = str2;
            this.f45926v = str3;
            this.f45927w = i11;
            this.f45928x = i12;
            this.f45929y = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45927w | 1);
            int g12 = ah.o.g(this.f45928x);
            int g13 = ah.o.g(this.f45929y);
            String str = this.f45925u;
            String str2 = this.f45926v;
            d.this.g(this.f45906b, this.f45907c, this.f45908d, this.f45909e, this.f45910f, this.f45911g, this.f45912h, this.f45913i, this.f45914j, this.f45915k, this.f45916l, this.f45917m, this.f45918n, this.f45919o, this.f45920p, this.f45921q, this.f45922r, this.f45923s, this.f45924t, str, str2, aVar, g11, g12, g13);
            return nm0.y.f85009a;
        }
    }

    public final void a(ym0.a<nm0.y> onConfirm, ym0.a<nm0.y> onCancel, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onConfirm, "onConfirm");
        kotlin.jvm.internal.u.j(onCancel, "onCancel");
        androidx.compose.runtime.b g11 = aVar.g(416186177);
        if ((i11 & 14) == 0) {
            if (g11.w(onConfirm)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onCancel)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        int i15 = i12;
        if ((i15 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.ui.e p11 = ah.k.p(androidx.compose.foundation.layout.x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.B()));
            int i16 = androidx.compose.foundation.layout.e.f4229i;
            androidx.compose.ui.layout.l0 a11 = com.withings.authentication.e.a(com.withings.authentication.d.b(g11, -483455358), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(p11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                nk.a0.g(0, 0, 29, 0L, g11, null, null, ay.b.u(C1987R.string.pregnancy_mode_page_deactivation_confirm_title, g11));
                com.withings.common.compose.component.v0.b(0.0f, g11, 0, 1);
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.pregnancy_mode_page_deactivation_confirm_button_yes, g11), null, false, ColorStyle.f33323b, null, false, onConfirm, g11, ((i15 << 21) & 29360128) | 24576, 109);
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.pregnancy_mode_page_deactivation_confirm_button_no, g11), null, false, ColorStyle.f33322a, null, false, onCancel, g11, ((i15 << 18) & 29360128) | 24576, 109);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a(onConfirm, onCancel, i11));
        }
    }

    public final void b(ym0.a<nm0.y> onBackClicked, ym0.a<nm0.y> onDisableClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onDisableClicked, "onDisableClicked");
        androidx.compose.runtime.b g11 = aVar.g(-1407312202);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClicked)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onDisableClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.K(this)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            c(onBackClicked, s1.b.b(g11, 1076600655, new b(onDisableClicked)), g11, (i12 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 14) | 48);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(onBackClicked, onDisableClicked, i11));
        }
    }

    public final void c(ym0.a<nm0.y> onBackClicked, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> buttons, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(buttons, "buttons");
        androidx.compose.runtime.b g11 = aVar.g(1970353488);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClicked)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(buttons)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            int i15 = i12 << 6;
            b70.t0.c(ay.b.u(C1987R.string.pregnancy_mode_page_title, g11), s2.d.a(2131232244, g11), onBackClicked, buttons, null, 0.0f, null, com.withings.tutorials.ui.screens.modes.pregnancy.a.f45833b, g11, (i15 & ConstantsWs.HWFAILURE_ZERO) | 12582976 | (i15 & 7168), 112);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new C0632d(onBackClicked, buttons, i11));
        }
    }

    public final void d(PregnancyModeViewModel viewModel, ym0.a<nm0.y> onBack, ym0.a<nm0.y> onFinish, ym0.a<nm0.y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        kotlin.jvm.internal.u.j(viewModel, "viewModel");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onFinish, "onFinish");
        androidx.compose.runtime.b c11 = g6.c(aVar, "onNext", aVar2, -188736752, -103715328);
        Object t11 = c11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            c11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        c11.J();
        boolean booleanValue = ((Boolean) r0Var.getValue()).booleanValue();
        c11.s(-103715199);
        Object t12 = c11.t();
        if (t12 == a.C0060a.a()) {
            t12 = new e(r0Var);
            c11.n(t12);
        }
        c11.J();
        int i12 = i11 >> 3;
        e70.a.a(booleanValue, onFinish, (ym0.a) t12, c11, (i12 & 112) | ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED);
        Object c12 = androidx.compose.material.o.c(c11, 773894976, -492369756);
        if (c12 == a.C0060a.a()) {
            c12 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(c11), c11);
        }
        c11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) c12).a();
        c11.J();
        e(onBack, new f(a11, viewModel, aVar, r0Var), onFinish, c11, (i12 & 14) | (i11 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 7168));
        androidx.compose.runtime.v o02 = c11.o0();
        if (o02 != null) {
            o02.G(new g(viewModel, onBack, onFinish, aVar, i11));
        }
    }

    public final void e(ym0.a<nm0.y> onBackClicked, ym0.a<nm0.y> onNextClicked, ym0.a<nm0.y> onLaterClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        kotlin.jvm.internal.u.j(onLaterClicked, "onLaterClicked");
        androidx.compose.runtime.b g11 = aVar.g(-59924338);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClicked)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onNextClicked)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onLaterClicked)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (g11.K(this)) {
                i13 = ModuleCopy.f28574b;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            c(onBackClicked, s1.b.b(g11, -83833049, new h(onNextClicked, onLaterClicked)), g11, ((i12 >> 3) & ConstantsWs.HWFAILURE_ZERO) | (i12 & 14) | 48);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new i(onBackClicked, onNextClicked, onLaterClicked, i11));
        }
    }

    public final void f(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-1773400651);
        if ((i11 & 1) == 0 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a);
            e.b b10 = androidx.compose.foundation.layout.e.b();
            d.a g12 = b.a.g();
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(b10, g12, g11);
            g11.s(-1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                f5.b(0.0f, 0, 0, 31, 0L, 0L, g11, null);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(i11));
        }
    }

    public final void g(PregnancyModeViewModel viewModel, r8.n navController, String title, Double d11, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DueDateMethod dueDateMethod, s60.a weightFormState, ym0.a<nm0.y> onBack, ym0.l<? super String, nm0.y> onNext, ym0.a<nm0.y> onDeactivate, ym0.a<nm0.y> onUnknownDateClick, ym0.l<? super DateTime, nm0.y> onDueDateChanged, ym0.l<? super DateTime, nm0.y> onLastPeriodDateChanged, ym0.l<? super DateTime, nm0.y> onConceptionDateChanged, ym0.l<? super DueDateMethod, nm0.y> onMethodChanged, ym0.a<nm0.y> onWeightUnitClicked, ym0.a<nm0.y> onFinish, String startDestination, String formattedDueDate, androidx.compose.runtime.a aVar, int i11, int i12, int i13) {
        kotlin.jvm.internal.u.j(viewModel, "viewModel");
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(weightFormState, "weightFormState");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onNext, "onNext");
        kotlin.jvm.internal.u.j(onDeactivate, "onDeactivate");
        kotlin.jvm.internal.u.j(onUnknownDateClick, "onUnknownDateClick");
        kotlin.jvm.internal.u.j(onDueDateChanged, "onDueDateChanged");
        kotlin.jvm.internal.u.j(onLastPeriodDateChanged, "onLastPeriodDateChanged");
        kotlin.jvm.internal.u.j(onConceptionDateChanged, "onConceptionDateChanged");
        kotlin.jvm.internal.u.j(onMethodChanged, "onMethodChanged");
        kotlin.jvm.internal.u.j(onWeightUnitClicked, "onWeightUnitClicked");
        kotlin.jvm.internal.u.j(onFinish, "onFinish");
        kotlin.jvm.internal.u.j(startDestination, "startDestination");
        kotlin.jvm.internal.u.j(formattedDueDate, "formattedDueDate");
        androidx.compose.runtime.b g11 = aVar.g(564876854);
        b70.t0.b(navController, startDestination, new k(viewModel, onBack, onFinish, onNext, onDeactivate, title, dateTime3, onUnknownDateClick, onDueDateChanged, dueDateMethod, onMethodChanged, dateTime, formattedDueDate, onLastPeriodDateChanged, dateTime2, onConceptionDateChanged, d11, weightFormState, onWeightUnitClicked), g11, ((i12 >> 24) & 112) | 8);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l(viewModel, navController, title, d11, dateTime, dateTime2, dateTime3, dueDateMethod, weightFormState, onBack, onNext, onDeactivate, onUnknownDateClick, onDueDateChanged, onLastPeriodDateChanged, onConceptionDateChanged, onMethodChanged, onWeightUnitClicked, onFinish, startDestination, formattedDueDate, i11, i12, i13));
        }
    }
}
