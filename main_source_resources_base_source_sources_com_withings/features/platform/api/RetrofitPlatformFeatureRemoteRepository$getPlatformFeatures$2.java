package com.withings.features.platform.api;

import com.withings.feature.platform.model.PlatformFeatureListWS;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/feature/platform/model/PlatformFeatureListWS;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.features.platform.api.RetrofitPlatformFeatureRemoteRepository$getPlatformFeatures$2", f = "RetrofitPlatformFeatureRemoteRepository.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitPlatformFeatureRemoteRepository$getPlatformFeatures$2 extends i implements p<CoroutineScope, d<? super PlatformFeatureListWS>, Object> {
    int label;
    final /* synthetic */ RetrofitPlatformFeatureRemoteRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetrofitPlatformFeatureRemoteRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/feature/platform/model/PlatformFeatureListWS;", "Lcom/withings/features/platform/api/PlatformFeatureRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.withings.features.platform.api.RetrofitPlatformFeatureRemoteRepository$getPlatformFeatures$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends w implements l<PlatformFeatureRetrofit1Api, PlatformFeatureListWS> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // ym0.l
        public final PlatformFeatureListWS invoke(PlatformFeatureRetrofit1Api withApiForAccount) {
            u.j(withApiForAccount, "$this$withApiForAccount");
            return withApiForAccount.getPlatformFeatures();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RetrofitPlatformFeatureRemoteRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/feature/platform/model/PlatformFeatureListWS;", "Lcom/withings/features/platform/api/PlatformFeatureRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @e(c = "com.withings.features.platform.api.RetrofitPlatformFeatureRemoteRepository$getPlatformFeatures$2$2", f = "RetrofitPlatformFeatureRemoteRepository.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: com.withings.features.platform.api.RetrofitPlatformFeatureRemoteRepository$getPlatformFeatures$2$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends i implements p<PlatformFeatureRetrofit2Api, d<? super PlatformFeatureListWS>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // ym0.p
        public final Object invoke(PlatformFeatureRetrofit2Api platformFeatureRetrofit2Api, d<? super PlatformFeatureListWS> dVar) {
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
                this.label = 1;
                obj = ((PlatformFeatureRetrofit2Api) this.L$0).getPlatformFeatures(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitPlatformFeatureRemoteRepository$getPlatformFeatures$2(RetrofitPlatformFeatureRemoteRepository retrofitPlatformFeatureRemoteRepository, d<? super RetrofitPlatformFeatureRemoteRepository$getPlatformFeatures$2> dVar) {
        super(2, dVar);
        this.this$0 = retrofitPlatformFeatureRemoteRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new RetrofitPlatformFeatureRemoteRepository$getPlatformFeatures$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
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
            aVar = this.this$0.compatWS;
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.label = 1;
            obj = a.d(aVar, anonymousClass1, anonymousClass2, null, false, this, 124);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super PlatformFeatureListWS> dVar) {
        return ((RetrofitPlatformFeatureRemoteRepository$getPlatformFeatures$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
