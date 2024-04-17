package com.withings.manualLogging.ui.feature.addNote;

import android.content.Context;
import com.withings.manualLogging.ui.common.LogType;
import com.withings.manualLogging.ui.uikit.atoms.ManualLogCategory;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class o0 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f41538a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41539b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LogType f41540c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r8.n f41541d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r8.n nVar, LogType logType, AddManualLogActivity addManualLogActivity, k1 k1Var) {
        super(4);
        this.f41538a = k1Var;
        this.f41539b = addManualLogActivity;
        this.f41540c = logType;
        this.f41541d = nVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        AddManualLogActivity addManualLogActivity;
        int i11;
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        Context context = (Context) aVar2.D(androidx.compose.ui.platform.u0.d());
        sm0.a<ManualLogCategory> b10 = ManualLogCategory.b();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((kotlin.collections.c) b10).iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            addManualLogActivity = this.f41539b;
            if (!hasNext) {
                break;
            }
            Object next = it2.next();
            if (AddManualLogActivity.E3(addManualLogActivity, (ManualLogCategory) next)) {
                arrayList.add(next);
            }
        }
        k1 k1Var = this.f41538a;
        nm0.j jVar = (nm0.j) t1.d.a(k1Var.U0(), aVar2).getValue();
        if (jVar != null) {
            User user = (User) jVar.a();
            if (((Boolean) jVar.b()).booleanValue()) {
                i11 = C1987R.string._MANUAL_MEASUREMENT_TOP_PHRASE_MAIN_USER_;
            } else {
                i11 = C1987R.string._MANUAL_MEASUREMENT_TOP_PHRASE_SECONDARY_USER_;
            }
            k1.y.f("analytics", new kotlin.coroutines.jvm.internal.i(2, null), aVar2);
            String l5 = user.l();
            kotlin.jvm.internal.u.i(l5, "getFirstName(...)");
            w1.a(ay.b.v(i11, new Object[]{l5}, aVar2), this.f41540c, user, new k0(addManualLogActivity), new l0(addManualLogActivity, user, this.f41541d, context), arrayList, null, s1.b.b(aVar2, -651051237, new n0(k1Var, addManualLogActivity)), aVar2, 12845568, 64);
        }
        return nm0.y.f85009a;
    }
}
