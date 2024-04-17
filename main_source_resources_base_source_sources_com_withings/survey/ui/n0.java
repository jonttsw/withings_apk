package com.withings.survey.ui;

import android.content.Context;
import com.withings.common.compose.component.z4;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.survey.viewModel.InAppSurveyViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class n0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44389a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t50.a f44390b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f44391c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f44392d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f44393e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ z4 f44394f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f44395g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(InAppSurveyActivity inAppSurveyActivity, t50.a aVar, CoroutineScope coroutineScope, Context context, k1.r0<Boolean> r0Var, z4 z4Var, String str) {
        super(0);
        this.f44389a = inAppSurveyActivity;
        this.f44390b = aVar;
        this.f44391c = coroutineScope;
        this.f44392d = context;
        this.f44393e = r0Var;
        this.f44394f = z4Var;
        this.f44395g = str;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        InAppSurveyViewModel E3;
        Object obj;
        InAppSurveyViewModel E32;
        InAppSurveyViewModel E33;
        InAppSurveyViewModel E34;
        InAppSurveyActivity inAppSurveyActivity = this.f44389a;
        E3 = inAppSurveyActivity.E3();
        if (!E3.Y0()) {
            BuildersKt__Builders_commonKt.launch$default(this.f44391c, null, null, new m0(this.f44394f, this.f44395g, null), 3, null);
        } else {
            Iterator<T> it = this.f44390b.a().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.jvm.internal.u.e(((h50.a) obj).a(), "open_webpage")) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            h50.a aVar = (h50.a) obj;
            if (aVar != null) {
                E33 = inAppSurveyActivity.E3();
                Iterable<z50.a> iterable = (Iterable) E33.X0().getValue();
                ArrayList arrayList = new ArrayList(kotlin.collections.x.y(iterable, 10));
                for (z50.a aVar2 : iterable) {
                    arrayList.add(aVar2.a());
                }
                if (aVar.l(arrayList)) {
                    E34 = inAppSurveyActivity.E3();
                    String K0 = E34.K0(aVar);
                    if (K0 != null) {
                        HMWebActivity.a aVar3 = HMWebActivity.f35395c;
                        Context context = this.f44392d;
                        context.startActivity(HMWebActivity.a.a(aVar3, context, null, "", K0, 18));
                    }
                }
            }
            E32 = inAppSurveyActivity.E3();
            E32.c1();
            BuildersKt__Builders_commonKt.launch$default(this.f44391c, null, null, new l0(this.f44393e, null), 3, null);
        }
        return nm0.y.f85009a;
    }
}
