package com.withings.badge.detail;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.app.f0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.badge.detail.k;
import com.withings.wiscale2.C1987R;
import ga.f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import nm0.y;
import ym0.p;
/* compiled from: BadgeDetailViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/badge/detail/BadgeDetailViewModel;", "Landroidx/lifecycle/g1;", "badge_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BadgeDetailViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final bi.a f32717a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableSharedFlow<y> f32718b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedFlow<y> f32719c;

    /* renamed from: d  reason: collision with root package name */
    private ai.a f32720d;

    /* renamed from: e  reason: collision with root package name */
    private final StateFlow<k> f32721e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgeDetailViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.badge.detail.BadgeDetailViewModel$shareContent$1", f = "BadgeDetailViewModel.kt", l = {83}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        f0 f32725a;

        /* renamed from: b  reason: collision with root package name */
        int f32726b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f32727c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f32728d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Drawable f32729e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ BadgeDetailViewModel f32730f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, k kVar, Drawable drawable, BadgeDetailViewModel badgeDetailViewModel, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f32727c = context;
            this.f32728d = kVar;
            this.f32729e = drawable;
            this.f32730f = badgeDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f32727c, this.f32728d, this.f32729e, this.f32730f, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            f0 f0Var;
            f0 f0Var2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f32726b;
            if (i11 != 0) {
                if (i11 == 1) {
                    f0Var2 = this.f32725a;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                Context context = this.f32727c;
                f0Var = new f0(context);
                f0Var.j("image/*");
                f0Var.i(((k.b) this.f32728d).a().k());
                f0Var.d(C1987R.string._SHARE_);
                Drawable drawable = this.f32729e;
                if (drawable != null) {
                    this.f32725a = f0Var;
                    this.f32726b = 1;
                    this.f32730f.getClass();
                    Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new m(context, drawable, null), this);
                    if (withContext == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    f0Var2 = f0Var;
                    obj = withContext;
                }
                f0Var.k();
                return y.f85009a;
            }
            Uri uri = (Uri) obj;
            if (uri != null) {
                f0Var2.a(uri);
            }
            f0Var = f0Var2;
            f0Var.k();
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class c implements Flow<k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f32731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BadgeDetailViewModel f32732b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f32733a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ BadgeDetailViewModel f32734b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.badge.detail.BadgeDetailViewModel$special$$inlined$map$1$2", f = "BadgeDetailViewModel.kt", l = {224, 223}, m = "emit")
            /* renamed from: com.withings.badge.detail.BadgeDetailViewModel$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0439a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f32735a;

                /* renamed from: b  reason: collision with root package name */
                int f32736b;

                /* renamed from: c  reason: collision with root package name */
                FlowCollector f32737c;

                public C0439a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f32735a = obj;
                    this.f32736b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, BadgeDetailViewModel badgeDetailViewModel) {
                this.f32733a = flowCollector;
                this.f32734b = badgeDetailViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, qm0.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.withings.badge.detail.BadgeDetailViewModel.c.a.C0439a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.withings.badge.detail.BadgeDetailViewModel$c$a$a r0 = (com.withings.badge.detail.BadgeDetailViewModel.c.a.C0439a) r0
                    int r1 = r0.f32736b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f32736b = r1
                    goto L18
                L13:
                    com.withings.badge.detail.BadgeDetailViewModel$c$a$a r0 = new com.withings.badge.detail.BadgeDetailViewModel$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f32735a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f32736b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L38
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    nm0.l.b(r8)
                    goto L5b
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L32:
                    kotlinx.coroutines.flow.FlowCollector r7 = r0.f32737c
                    nm0.l.b(r8)
                    goto L4f
                L38:
                    nm0.l.b(r8)
                    ai.a r7 = (ai.a) r7
                    kotlinx.coroutines.flow.FlowCollector r8 = r6.f32733a
                    r0.f32737c = r8
                    r0.f32736b = r4
                    com.withings.badge.detail.BadgeDetailViewModel r2 = r6.f32734b
                    java.lang.Object r7 = com.withings.badge.detail.BadgeDetailViewModel.f0(r2, r7, r0)
                    if (r7 != r1) goto L4c
                    return r1
                L4c:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L4f:
                    r2 = 0
                    r0.f32737c = r2
                    r0.f32736b = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5b
                    return r1
                L5b:
                    nm0.y r7 = nm0.y.f85009a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.badge.detail.BadgeDetailViewModel.c.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public c(Flow flow, BadgeDetailViewModel badgeDetailViewModel) {
            this.f32731a = flow;
            this.f32732b = badgeDetailViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super k> flowCollector, qm0.d dVar) {
            Object collect = this.f32731a.collect(new a(flowCollector, this.f32732b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bi.a, java.lang.Object] */
    @Inject
    public BadgeDetailViewModel(u0 savedStateHandle, zh.a badgeLocalRepository) {
        u.j(savedStateHandle, "savedStateHandle");
        u.j(badgeLocalRepository, "badgeLocalRepository");
        this.f32717a = new Object();
        Object c11 = savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        u.g(c11);
        long longValue = ((Number) c11).longValue();
        Object c12 = savedStateHandle.c("badge_id");
        u.g(c12);
        MutableSharedFlow<y> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f32718b = MutableSharedFlow$default;
        this.f32719c = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.f32721e = FlowKt.stateIn(new c(badgeLocalRepository.a(longValue, (String) c12), this), h1.a(this), SharingStarted.Companion.getEagerly(), k.c.f32778a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(com.withings.badge.detail.BadgeDetailViewModel r4, ai.a r5, qm0.d r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.withings.badge.detail.l
            if (r0 == 0) goto L16
            r0 = r6
            com.withings.badge.detail.l r0 = (com.withings.badge.detail.l) r0
            int r1 = r0.f32783e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f32783e = r1
            goto L1b
        L16:
            com.withings.badge.detail.l r0 = new com.withings.badge.detail.l
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f32781c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f32783e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            ai.a r5 = r0.f32780b
            com.withings.badge.detail.BadgeDetailViewModel r4 = r0.f32779a
            nm0.l.b(r6)
            goto L55
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            nm0.l.b(r6)
            if (r5 != 0) goto L3e
            com.withings.badge.detail.k$a r1 = com.withings.badge.detail.k.a.f32776a
            goto L5c
        L3e:
            java.lang.String r6 = r5.c()
            if (r6 != 0) goto L55
            nm0.y r6 = nm0.y.f85009a
            r0.f32779a = r4
            r0.f32780b = r5
            r0.f32783e = r3
            kotlinx.coroutines.flow.MutableSharedFlow<nm0.y> r2 = r4.f32718b
            java.lang.Object r6 = r2.emit(r6, r0)
            if (r6 != r1) goto L55
            goto L5c
        L55:
            r4.f32720d = r5
            com.withings.badge.detail.k$b r1 = new com.withings.badge.detail.k$b
            r1.<init>(r5)
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.badge.detail.BadgeDetailViewModel.f0(com.withings.badge.detail.BadgeDetailViewModel, ai.a, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(Context context, Drawable drawable) {
        k value = this.f32721e.getValue();
        if (value instanceof k.b) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new b(context, value, drawable, this, null), 3, null);
        }
    }

    public final StateFlow<k> i0() {
        return this.f32721e;
    }

    public final SharedFlow<y> j0() {
        return this.f32719c;
    }

    public final void k0(Context context) {
        u.j(context, "context");
        f.a aVar = new f.a(context);
        ai.a aVar2 = this.f32720d;
        if (aVar2 != null) {
            String d11 = aVar2.d();
            this.f32717a.getClass();
            aVar.d(bi.a.b(d11));
            aVar.r(new a(context, context));
            w9.a.a(context).d(aVar.b());
            return;
        }
        u.s("badge");
        throw null;
    }

    /* compiled from: ImageRequest.kt */
    /* loaded from: classes3.dex */
    public static final class a implements ia.a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f32723b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f32724c;

        public a(Context context, Context context2) {
            this.f32723b = context;
            this.f32724c = context2;
        }

        @Override // ia.a
        public final void onError(Drawable drawable) {
            BadgeDetailViewModel.this.m0(this.f32723b, null);
        }

        @Override // ia.a
        public final void onSuccess(Drawable drawable) {
            BadgeDetailViewModel.this.m0(this.f32724c, drawable);
        }

        @Override // ia.a
        public final void onStart(Drawable drawable) {
        }
    }
}
