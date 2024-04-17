package com.withings.manualLogging.ui.feature.addNote;

import android.content.Context;
import com.withings.common.compose.component.y3;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.ui.uikit.atoms.SaveManualLogButtonStatus;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* compiled from: AddSymptomsScreen.kt */
/* loaded from: classes4.dex */
public final class s1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddSymptomsScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<fx.f> f41572a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f41573b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ fx.e f41574c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<fx.f, nm0.y> f41575d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<fx.f, nm0.y> f41576e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.l<fx.f, nm0.y> f41577f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<fx.f> list, Context context, fx.e eVar, ym0.l<? super fx.f, nm0.y> lVar, ym0.l<? super fx.f, nm0.y> lVar2, ym0.l<? super fx.f, nm0.y> lVar3) {
            super(2);
            this.f41572a = list;
            this.f41573b = context;
            this.f41574c = eVar;
            this.f41575d = lVar;
            this.f41576e = lVar2;
            this.f41577f = lVar3;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                y3.c(null, null, null, null, 0.0f, 0L, s1.b.b(aVar2, 1638385608, new r1(this.f41572a, this.f41573b, this.f41574c, this.f41575d, this.f41576e, this.f41577f)), aVar2, 1572864, 63);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddSymptomsScreen.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SaveManualLogButtonStatus f41578a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<fx.f, nm0.y> f41579b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<fx.f, nm0.y> f41580c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<fx.f, nm0.y> f41581d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41582e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41583f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ fx.e f41584g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List<fx.f> f41585h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f41586i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(SaveManualLogButtonStatus saveManualLogButtonStatus, ym0.l<? super fx.f, nm0.y> lVar, ym0.l<? super fx.f, nm0.y> lVar2, ym0.l<? super fx.f, nm0.y> lVar3, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, fx.e eVar, List<fx.f> list, int i11) {
            super(2);
            this.f41578a = saveManualLogButtonStatus;
            this.f41579b = lVar;
            this.f41580c = lVar2;
            this.f41581d = lVar3;
            this.f41582e = aVar;
            this.f41583f = aVar2;
            this.f41584g = eVar;
            this.f41585h = list;
            this.f41586i = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f41586i | 1);
            fx.e eVar = this.f41584g;
            List<fx.f> list = this.f41585h;
            s1.a(this.f41578a, this.f41579b, this.f41580c, this.f41581d, this.f41582e, this.f41583f, eVar, list, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(SaveManualLogButtonStatus saveManualLogButtonStatus, ym0.l<? super fx.f, nm0.y> onAddSymptom, ym0.l<? super fx.f, nm0.y> onRemoveSymptom, ym0.l<? super fx.f, nm0.y> onClickInfo, ym0.a<nm0.y> onClickOnSave, ym0.a<nm0.y> onClickOnClose, fx.e noteGroup, List<fx.f> allSymptoms, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(saveManualLogButtonStatus, "saveManualLogButtonStatus");
        kotlin.jvm.internal.u.j(onAddSymptom, "onAddSymptom");
        kotlin.jvm.internal.u.j(onRemoveSymptom, "onRemoveSymptom");
        kotlin.jvm.internal.u.j(onClickInfo, "onClickInfo");
        kotlin.jvm.internal.u.j(onClickOnSave, "onClickOnSave");
        kotlin.jvm.internal.u.j(onClickOnClose, "onClickOnClose");
        kotlin.jvm.internal.u.j(noteGroup, "noteGroup");
        kotlin.jvm.internal.u.j(allSymptoms, "allSymptoms");
        androidx.compose.runtime.b g11 = aVar.g(629861371);
        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
        String string = context.getString(C1987R.string.manualLogging_logSymptomsLogScreen_title);
        int i12 = i11 >> 3;
        yx.a.a(string, androidx.appcompat.widget.v0.c(string, "getString(...)", context, C1987R.string._SAVE_, "getString(...)"), saveManualLogButtonStatus, onClickOnSave, onClickOnClose, s1.b.b(g11, 528406692, new a(allSymptoms, context, noteGroup, onRemoveSymptom, onAddSymptom, onClickInfo)), g11, ((i11 << 6) & ConstantsWs.HWFAILURE_ZERO) | 196608 | (i12 & 7168) | (i12 & 57344));
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(saveManualLogButtonStatus, onAddSymptom, onRemoveSymptom, onClickInfo, onClickOnSave, onClickOnClose, noteGroup, allSymptoms, i11));
        }
    }
}
