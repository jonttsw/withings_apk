package com.withings.manualLogging.ui.feature.addNote;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.k4;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.ui.uikit.atoms.SaveManualLogButtonStatus;
import com.withings.wiscale2.C1987R;
/* compiled from: AddCommentScreen.kt */
/* loaded from: classes4.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddCommentScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f41431a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ fx.e f41432b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b2.k f41433c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<fx.a, nm0.y> f41434d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k4 f41435e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Context context, fx.e eVar, b2.k kVar, ym0.l<? super fx.a, nm0.y> lVar, k4 k4Var) {
            super(2);
            this.f41431a = context;
            this.f41432b = eVar;
            this.f41433c = kVar;
            this.f41434d = lVar;
            this.f41435e = k4Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                InputFieldType inputFieldType = InputFieldType.f33877e;
                Context context = this.f41431a;
                String string = context.getString(C1987R.string._NOTES_);
                fx.e eVar = this.f41432b;
                fx.a g11 = eVar.g();
                String str = (g11 == null || (r1 = g11.b()) == null) ? "" : "";
                String string2 = context.getString(C1987R.string._TM_NOTE_TEXT_PLACEHOLDER_);
                androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
                kotlin.jvm.internal.u.g(string2);
                fk.q.b(h11, inputFieldType, null, string, str, null, string2, null, null, null, null, false, this.f41433c, null, 1, null, false, null, new com.withings.manualLogging.ui.feature.addNote.a(this.f41434d, eVar), aVar2, 48, 24576, 241572);
                k1.y.c(nm0.y.f85009a, new c(eVar, this.f41433c, this.f41435e), aVar2);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddCommentScreen.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SaveManualLogButtonStatus f41436a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<fx.a, nm0.y> f41437b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41438c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41439d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ fx.e f41440e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b2.k f41441f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k4 f41442g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f41443h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f41444i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(SaveManualLogButtonStatus saveManualLogButtonStatus, ym0.l<? super fx.a, nm0.y> lVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, fx.e eVar, b2.k kVar, k4 k4Var, int i11, int i12) {
            super(2);
            this.f41436a = saveManualLogButtonStatus;
            this.f41437b = lVar;
            this.f41438c = aVar;
            this.f41439d = aVar2;
            this.f41440e = eVar;
            this.f41441f = kVar;
            this.f41442g = k4Var;
            this.f41443h = i11;
            this.f41444i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f41443h | 1);
            b2.k kVar = this.f41441f;
            k4 k4Var = this.f41442g;
            d.a(this.f41436a, this.f41437b, this.f41438c, this.f41439d, this.f41440e, kVar, k4Var, aVar, g11, this.f41444i);
            return nm0.y.f85009a;
        }
    }

    public static final void a(SaveManualLogButtonStatus saveManualLogButtonStatus, ym0.l<? super fx.a, nm0.y> onValueChange, ym0.a<nm0.y> onClickOnSave, ym0.a<nm0.y> onClickOnClose, fx.e noteGroup, b2.k kVar, k4 k4Var, androidx.compose.runtime.a aVar, int i11, int i12) {
        b2.k kVar2;
        k4 k4Var2;
        int i13;
        kotlin.jvm.internal.u.j(saveManualLogButtonStatus, "saveManualLogButtonStatus");
        kotlin.jvm.internal.u.j(onValueChange, "onValueChange");
        kotlin.jvm.internal.u.j(onClickOnSave, "onClickOnSave");
        kotlin.jvm.internal.u.j(onClickOnClose, "onClickOnClose");
        kotlin.jvm.internal.u.j(noteGroup, "noteGroup");
        androidx.compose.runtime.b g11 = aVar.g(849967759);
        if ((i12 & 32) != 0) {
            g11.s(-644508371);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = new b2.k();
                g11.n(t11);
            }
            g11.J();
            kVar2 = (b2.k) t11;
        } else {
            kVar2 = kVar;
        }
        if ((i12 & 64) != 0) {
            k4Var2 = (k4) g11.D(androidx.compose.ui.platform.n1.m());
            i13 = i11 & (-3670017);
        } else {
            k4Var2 = k4Var;
            i13 = i11;
        }
        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
        String string = context.getString(C1987R.string.manualLogging_logNoteLogScreen_title);
        int i14 = i13 << 3;
        yx.a.a(string, androidx.appcompat.widget.v0.c(string, "getString(...)", context, C1987R.string._SAVE_, "getString(...)"), saveManualLogButtonStatus, onClickOnSave, onClickOnClose, s1.b.b(g11, 371951302, new a(context, noteGroup, kVar2, onValueChange, k4Var2)), g11, ((i13 << 6) & ConstantsWs.HWFAILURE_ZERO) | 196608 | (i14 & 7168) | (i14 & 57344));
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(saveManualLogButtonStatus, onValueChange, onClickOnSave, onClickOnClose, noteGroup, kVar2, k4Var2, i11, i12));
        }
    }
}
