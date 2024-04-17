package com.withings.survey.viewModel;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppSurveyViewModel.kt */
@e(c = "com.withings.survey.viewModel.InAppSurveyViewModel$submitLocalActions$1", f = "InAppSurveyViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONG_COUNTRY}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f44530a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ InAppSurveyViewModel f44531b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Boolean f44532c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Boolean f44533d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f44534e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Boolean f44535f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InAppSurveyViewModel inAppSurveyViewModel, Boolean bool, Boolean bool2, String str, Boolean bool3, d<? super a> dVar) {
        super(2, dVar);
        this.f44531b = inAppSurveyViewModel;
        this.f44532c = bool;
        this.f44533d = bool2;
        this.f44534e = str;
        this.f44535f = bool3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new a(this.f44531b, this.f44532c, this.f44533d, this.f44534e, this.f44535f, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.survey.viewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
