package com.withings.medicalreport.webservices;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.medicalreport.model.MedicalReport;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import s00.a;
import ym0.l;
import ym0.p;
/* compiled from: RetrofitMedicalReportRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/medicalreport/model/MedicalReport;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.medicalreport.webservices.RetrofitMedicalReportRemoteRepository$generatePdf$2", f = "RetrofitMedicalReportRemoteRepository.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitMedicalReportRemoteRepository$generatePdf$2 extends i implements p<CoroutineScope, d<? super MedicalReport>, Object> {
    final /* synthetic */ String $endDate;
    final /* synthetic */ String $properties;
    final /* synthetic */ String $startDate;
    final /* synthetic */ long $userId;
    int label;
    final /* synthetic */ RetrofitMedicalReportRemoteRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetrofitMedicalReportRemoteRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/medicalreport/model/MedicalReport;", "Lcom/withings/medicalreport/webservices/MedicalReportRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.withings.medicalreport.webservices.RetrofitMedicalReportRemoteRepository$generatePdf$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends w implements l<MedicalReportRetrofit1Api, MedicalReport> {
        final /* synthetic */ String $endDate;
        final /* synthetic */ String $properties;
        final /* synthetic */ String $startDate;
        final /* synthetic */ long $userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j5, String str, String str2, String str3) {
            super(1);
            this.$userId = j5;
            this.$properties = str;
            this.$startDate = str2;
            this.$endDate = str3;
        }

        @Override // ym0.l
        public final MedicalReport invoke(MedicalReportRetrofit1Api withApiForAccount) {
            u.j(withApiForAccount, "$this$withApiForAccount");
            return withApiForAccount.generatePdf(this.$userId, this.$properties, this.$startDate, this.$endDate, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetrofitMedicalReportRemoteRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/medicalreport/model/MedicalReport;", "Lcom/withings/medicalreport/webservices/MedicalReportRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @e(c = "com.withings.medicalreport.webservices.RetrofitMedicalReportRemoteRepository$generatePdf$2$2", f = "RetrofitMedicalReportRemoteRepository.kt", l = {32}, m = "invokeSuspend")
    /* renamed from: com.withings.medicalreport.webservices.RetrofitMedicalReportRemoteRepository$generatePdf$2$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends i implements p<MedicalReportRetrofit2Api, d<? super MedicalReport>, Object> {
        final /* synthetic */ String $endDate;
        final /* synthetic */ String $properties;
        final /* synthetic */ String $startDate;
        final /* synthetic */ long $userId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(long j5, String str, String str2, String str3, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$userId = j5;
            this.$properties = str;
            this.$startDate = str2;
            this.$endDate = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$userId, this.$properties, this.$startDate, this.$endDate, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // ym0.p
        public final Object invoke(MedicalReportRetrofit2Api medicalReportRetrofit2Api, d<? super MedicalReport> dVar) {
            return ((AnonymousClass2) create(medicalReportRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                long j5 = this.$userId;
                String str = this.$properties;
                String str2 = this.$startDate;
                String str3 = this.$endDate;
                this.label = 1;
                obj = ((MedicalReportRetrofit2Api) this.L$0).generatePdf(j5, str, str2, str3, true, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitMedicalReportRemoteRepository$generatePdf$2(RetrofitMedicalReportRemoteRepository retrofitMedicalReportRemoteRepository, long j5, String str, String str2, String str3, d<? super RetrofitMedicalReportRemoteRepository$generatePdf$2> dVar) {
        super(2, dVar);
        this.this$0 = retrofitMedicalReportRemoteRepository;
        this.$userId = j5;
        this.$properties = str;
        this.$startDate = str2;
        this.$endDate = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new RetrofitMedicalReportRemoteRepository$generatePdf$2(this.this$0, this.$userId, this.$properties, this.$startDate, this.$endDate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        nm0.l.b(obj);
        aVar = this.this$0.compatWS;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$userId, this.$properties, this.$startDate, this.$endDate);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$userId, this.$properties, this.$startDate, this.$endDate, null);
        this.label = 1;
        Object d11 = a.d(aVar, anonymousClass1, anonymousClass2, null, false, this, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
        if (d11 == coroutineSingletons) {
            return coroutineSingletons;
        }
        return d11;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super MedicalReport> dVar) {
        return ((RetrofitMedicalReportRemoteRepository$generatePdf$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
