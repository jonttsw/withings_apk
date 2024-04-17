package com.withings.manualLogging.ui.feature.addNote;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.ui.uikit.atoms.SaveManualLogButtonStatus;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: AddMedicinesScreen.kt */
/* loaded from: classes4.dex */
public final class b1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddMedicinesScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fx.e f40723a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<fx.c> f40724b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f40725c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f40726d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<fx.c, nm0.y> f40727e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.l<fx.c, nm0.y> f40728f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(fx.e eVar, List<fx.c> list, Context context, k1.r0<String> r0Var, ym0.l<? super fx.c, nm0.y> lVar, ym0.l<? super fx.c, nm0.y> lVar2) {
            super(2);
            this.f40723a = eVar;
            this.f40724b = list;
            this.f40725c = context;
            this.f40726d = r0Var;
            this.f40727e = lVar;
            this.f40728f = lVar2;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                ArrayList arrayList = new ArrayList();
                fx.e eVar = this.f40723a;
                Iterator<fx.d> it = eVar.iterator();
                while (it.hasNext()) {
                    fx.d next = it.next();
                    if (next instanceof fx.c) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((fx.c) it2.next()).b());
                }
                List<fx.c> list = this.f40724b;
                List<fx.c> list2 = list;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.x.y(list2, 10));
                for (fx.c cVar : list2) {
                    arrayList3.add(cVar.getContent());
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    String str = (String) next2;
                    ArrayList arrayList5 = new ArrayList(kotlin.collections.x.y(eVar, 10));
                    Iterator<fx.d> it4 = eVar.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(it4.next().getContent());
                    }
                    if (!arrayList5.contains(str)) {
                        arrayList4.add(next2);
                    }
                }
                Context context = this.f40725c;
                String string = context.getString(C1987R.string.manualLogging_medecineLogScreen_recentSection_title);
                kotlin.jvm.internal.u.i(string, "getString(...)");
                ym0.l<fx.c, nm0.y> lVar = this.f40727e;
                w0 w0Var = new w0(lVar, list);
                x0 x0Var = new x0(this.f40728f, list);
                String string2 = context.getString(C1987R.string.manualLogging_medecineLogScreen_selectedSection_title);
                kotlin.jvm.internal.u.i(string2, "getString(...)");
                k1.r0<String> r0Var = this.f40726d;
                String value = r0Var.getValue();
                aVar2.s(1092039151);
                boolean K = aVar2.K(r0Var);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new y0(r0Var);
                    aVar2.n(t11);
                }
                ym0.l lVar2 = (ym0.l) t11;
                aVar2.J();
                aVar2.s(1092039248);
                boolean K2 = aVar2.K(lVar) | aVar2.K(r0Var);
                Object t12 = aVar2.t();
                if (K2 || t12 == a.C0060a.a()) {
                    t12 = new z0(r0Var, lVar);
                    aVar2.n(t12);
                }
                ym0.l lVar3 = (ym0.l) t12;
                aVar2.J();
                aVar2.s(1092039518);
                boolean K3 = aVar2.K(r0Var) | aVar2.K(lVar);
                Object t13 = aVar2.t();
                if (K3 || t13 == a.C0060a.a()) {
                    t13 = new a1(r0Var, lVar);
                    aVar2.n(t13);
                }
                aVar2.J();
                wk.d.a(arrayList2, arrayList4, string, w0Var, x0Var, null, new wk.a(string2, value, lVar2, lVar3, (ym0.a) t13), null, null, aVar2, 72, 416);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddMedicinesScreen.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SaveManualLogButtonStatus f40729a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<fx.c, nm0.y> f40730b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<fx.c, nm0.y> f40731c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40732d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f40733e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ fx.e f40734f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List<fx.c> f40735g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f40736h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(SaveManualLogButtonStatus saveManualLogButtonStatus, ym0.l<? super fx.c, nm0.y> lVar, ym0.l<? super fx.c, nm0.y> lVar2, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, fx.e eVar, List<fx.c> list, int i11) {
            super(2);
            this.f40729a = saveManualLogButtonStatus;
            this.f40730b = lVar;
            this.f40731c = lVar2;
            this.f40732d = aVar;
            this.f40733e = aVar2;
            this.f40734f = eVar;
            this.f40735g = list;
            this.f40736h = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f40736h | 1);
            fx.e eVar = this.f40734f;
            List<fx.c> list = this.f40735g;
            b1.a(this.f40729a, this.f40730b, this.f40731c, this.f40732d, this.f40733e, eVar, list, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddMedicinesScreen.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<k1.r0<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f40737a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final k1.r0<String> invoke() {
            ParcelableSnapshotMutableState f11;
            f11 = androidx.compose.runtime.l0.f("", androidx.compose.runtime.v0.f8878a);
            return f11;
        }
    }

    public static final void a(SaveManualLogButtonStatus saveManualLogButtonStatus, ym0.l<? super fx.c, nm0.y> onAddMedicine, ym0.l<? super fx.c, nm0.y> onRemoveMedicine, ym0.a<nm0.y> onClickOnSave, ym0.a<nm0.y> onClickOnClose, fx.e noteGroup, List<fx.c> allMedicines, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(saveManualLogButtonStatus, "saveManualLogButtonStatus");
        kotlin.jvm.internal.u.j(onAddMedicine, "onAddMedicine");
        kotlin.jvm.internal.u.j(onRemoveMedicine, "onRemoveMedicine");
        kotlin.jvm.internal.u.j(onClickOnSave, "onClickOnSave");
        kotlin.jvm.internal.u.j(onClickOnClose, "onClickOnClose");
        kotlin.jvm.internal.u.j(noteGroup, "noteGroup");
        kotlin.jvm.internal.u.j(allMedicines, "allMedicines");
        androidx.compose.runtime.b g11 = aVar.g(716240540);
        k1.r0 r0Var = (k1.r0) u1.f.a(new Object[0], null, null, c.f40737a, g11, 6);
        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
        String string = context.getString(C1987R.string.manualLogging_medecineLogScreen_title);
        yx.a.a(string, androidx.appcompat.widget.v0.c(string, "getString(...)", context, C1987R.string._SAVE_, "getString(...)"), saveManualLogButtonStatus, onClickOnSave, onClickOnClose, s1.b.b(g11, -1829987259, new a(noteGroup, allMedicines, context, r0Var, onAddMedicine, onRemoveMedicine)), g11, ((i11 << 6) & ConstantsWs.HWFAILURE_ZERO) | 196608 | (i11 & 7168) | (57344 & i11));
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(saveManualLogButtonStatus, onAddMedicine, onRemoveMedicine, onClickOnSave, onClickOnClose, noteGroup, allMedicines, i11));
        }
    }
}
