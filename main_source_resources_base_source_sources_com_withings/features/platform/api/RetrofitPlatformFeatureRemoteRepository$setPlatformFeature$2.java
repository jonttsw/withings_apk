package com.withings.features.platform.api;

import com.withings.library.authentication.api.ConstantsWs;
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
/* compiled from: RetrofitPlatformFeatureRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.features.platform.api.RetrofitPlatformFeatureRemoteRepository$setPlatformFeature$2", f = "RetrofitPlatformFeatureRemoteRepository.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitPlatformFeatureRemoteRepository$setPlatformFeature$2 extends i implements p<CoroutineScope, d<? super Object>, Object> {
    final /* synthetic */ Long $accountId;
    final /* synthetic */ Long $deviceId;
    final /* synthetic */ Long $endDate;
    final /* synthetic */ int $featureId;
    final /* synthetic */ Boolean $isTutorialSeen;
    final /* synthetic */ Long $startDate;
    final /* synthetic */ Long $userId;
    int label;
    final /* synthetic */ RetrofitPlatformFeatureRemoteRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetrofitPlatformFeatureRemoteRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/withings/features/platform/api/PlatformFeatureRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.withings.features.platform.api.RetrofitPlatformFeatureRemoteRepository$setPlatformFeature$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends w implements l<PlatformFeatureRetrofit1Api, Object> {
        final /* synthetic */ Long $accountId;
        final /* synthetic */ Long $deviceId;
        final /* synthetic */ Long $endDate;
        final /* synthetic */ int $featureId;
        final /* synthetic */ Boolean $isTutorialSeen;
        final /* synthetic */ Long $startDate;
        final /* synthetic */ Long $userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i11, Long l5, Long l6, Long l11, Long l12, Long l13, Boolean bool) {
            super(1);
            this.$featureId = i11;
            this.$deviceId = l5;
            this.$accountId = l6;
            this.$userId = l11;
            this.$startDate = l12;
            this.$endDate = l13;
            this.$isTutorialSeen = bool;
        }

        @Override // ym0.l
        public final Object invoke(PlatformFeatureRetrofit1Api withApiForAccount) {
            u.j(withApiForAccount, "$this$withApiForAccount");
            return withApiForAccount.setPlatformFeature(this.$featureId, this.$deviceId, this.$accountId, this.$userId, this.$startDate, this.$endDate, this.$isTutorialSeen);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetrofitPlatformFeatureRemoteRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/features/platform/api/PlatformFeatureRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/features/platform/api/PlatformFeatureRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.withings.features.platform.api.RetrofitPlatformFeatureRemoteRepository$setPlatformFeature$2$2", f = "RetrofitPlatformFeatureRemoteRepository.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: com.withings.features.platform.api.RetrofitPlatformFeatureRemoteRepository$setPlatformFeature$2$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends i implements p<PlatformFeatureRetrofit2Api, d<? super y>, Object> {
        final /* synthetic */ Long $accountId;
        final /* synthetic */ Long $deviceId;
        final /* synthetic */ Long $endDate;
        final /* synthetic */ int $featureId;
        final /* synthetic */ Boolean $isTutorialSeen;
        final /* synthetic */ Long $startDate;
        final /* synthetic */ Long $userId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i11, Long l5, Long l6, Long l11, Long l12, Long l13, Boolean bool, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$featureId = i11;
            this.$deviceId = l5;
            this.$accountId = l6;
            this.$userId = l11;
            this.$startDate = l12;
            this.$endDate = l13;
            this.$isTutorialSeen = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$featureId, this.$deviceId, this.$accountId, this.$userId, this.$startDate, this.$endDate, this.$isTutorialSeen, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // ym0.p
        public final Object invoke(PlatformFeatureRetrofit2Api platformFeatureRetrofit2Api, d<? super y> dVar) {
            return ((AnonymousClass2) create(platformFeatureRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
                int i12 = this.$featureId;
                Long l5 = this.$deviceId;
                Long l6 = this.$accountId;
                Long l11 = this.$userId;
                Long l12 = this.$startDate;
                Long l13 = this.$endDate;
                Boolean bool = this.$isTutorialSeen;
                this.label = 1;
                if (((PlatformFeatureRetrofit2Api) this.L$0).setPlatformFeature(i12, l5, l6, l11, l12, l13, bool, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitPlatformFeatureRemoteRepository$setPlatformFeature$2(RetrofitPlatformFeatureRemoteRepository retrofitPlatformFeatureRemoteRepository, int i11, Long l5, Long l6, Long l11, Long l12, Long l13, Boolean bool, d<? super RetrofitPlatformFeatureRemoteRepository$setPlatformFeature$2> dVar) {
        super(2, dVar);
        this.this$0 = retrofitPlatformFeatureRemoteRepository;
        this.$featureId = i11;
        this.$deviceId = l5;
        this.$accountId = l6;
        this.$userId = l11;
        this.$startDate = l12;
        this.$endDate = l13;
        this.$isTutorialSeen = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new RetrofitPlatformFeatureRemoteRepository$setPlatformFeature$2(this.this$0, this.$featureId, this.$deviceId, this.$accountId, this.$userId, this.$startDate, this.$endDate, this.$isTutorialSeen, dVar);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, d<? super Object> dVar) {
        return invoke2(coroutineScope, (d<Object>) dVar);
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$featureId, this.$deviceId, this.$accountId, this.$userId, this.$startDate, this.$endDate, this.$isTutorialSeen);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$featureId, this.$deviceId, this.$accountId, this.$userId, this.$startDate, this.$endDate, this.$isTutorialSeen, null);
        this.label = 1;
        Object d11 = a.d(aVar, anonymousClass1, anonymousClass2, null, false, this, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
        if (d11 == coroutineSingletons) {
            return coroutineSingletons;
        }
        return d11;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, d<Object> dVar) {
        return ((RetrofitPlatformFeatureRemoteRepository$setPlatformFeature$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
