package com.withings.wiscale2.legacyprograms;

import com.withings.programs.model.program.ProgramDomain;
import com.withings.user.User;
import com.withings.wiscale2.legacyprograms.WellnessProgramJoiner;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WellnessProgramJoiner.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$join$2", f = "WellnessProgramJoiner.kt", l = {91, 95, 97}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class WellnessProgramJoiner$join$2 extends i implements p<CoroutineScope, qm0.d<? super Object>, Object> {
    final /* synthetic */ ProgramDomain.LegacyDomain $wellnessProgram;
    int label;
    final /* synthetic */ WellnessProgramJoiner this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WellnessProgramJoiner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$join$2$1", f = "WellnessProgramJoiner.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$join$2$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
        final /* synthetic */ ProgramDomain.LegacyDomain $wellnessProgram;
        int label;
        final /* synthetic */ WellnessProgramJoiner this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WellnessProgramJoiner wellnessProgramJoiner, ProgramDomain.LegacyDomain legacyDomain, qm0.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = wellnessProgramJoiner;
            this.$wellnessProgram = legacyDomain;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$wellnessProgram, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            if (this.label == 0) {
                l.b(obj);
                this.this$0.startUrlToJoinProgram(this.$wellnessProgram);
                return y.f85009a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WellnessProgramJoiner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$join$2$2", f = "WellnessProgramJoiner.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$join$2$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
        int label;
        final /* synthetic */ WellnessProgramJoiner this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(WellnessProgramJoiner wellnessProgramJoiner, qm0.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = wellnessProgramJoiner;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new AnonymousClass2(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            WellnessProgramJoiner.Delegate delegate;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            if (this.label == 0) {
                l.b(obj);
                delegate = this.this$0.delegate;
                delegate.onMissingRequiredDevice();
                return y.f85009a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramJoiner$join$2(ProgramDomain.LegacyDomain legacyDomain, WellnessProgramJoiner wellnessProgramJoiner, qm0.d<? super WellnessProgramJoiner$join$2> dVar) {
        super(2, dVar);
        this.$wellnessProgram = legacyDomain;
        this.this$0 = wellnessProgramJoiner;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new WellnessProgramJoiner$join$2(this.$wellnessProgram, this.this$0, dVar);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, qm0.d<? super Object> dVar) {
        return invoke2(coroutineScope, (qm0.d<Object>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean isEligible;
        boolean hasAnyRequiredDevice;
        Object joinProgram;
        kn.e eVar;
        User user;
        boolean ownRequiredDevices;
        boolean hasEligibleUrl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.b(obj);
                return obj;
            }
            l.b(obj);
            return y.f85009a;
        }
        l.b(obj);
        isEligible = WellnessProgramJoinerKt.isEligible(this.$wellnessProgram);
        if (!isEligible) {
            hasEligibleUrl = WellnessProgramJoinerKt.hasEligibleUrl(this.$wellnessProgram);
            if (hasEligibleUrl) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$wellnessProgram, null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return y.f85009a;
            }
        }
        hasAnyRequiredDevice = WellnessProgramJoinerKt.hasAnyRequiredDevice(this.$wellnessProgram);
        if (hasAnyRequiredDevice) {
            ProgramDomain.LegacyDomain legacyDomain = this.$wellnessProgram;
            eVar = this.this$0.deviceManager;
            user = this.this$0.user;
            ownRequiredDevices = WellnessProgramJoinerKt.ownRequiredDevices(legacyDomain, eVar, user);
            if (!ownRequiredDevices) {
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 3;
                if (BuildersKt.withContext(main2, anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return y.f85009a;
            }
        }
        WellnessProgramJoiner wellnessProgramJoiner = this.this$0;
        ProgramDomain.LegacyDomain legacyDomain2 = this.$wellnessProgram;
        this.label = 2;
        joinProgram = wellnessProgramJoiner.joinProgram(legacyDomain2, this);
        if (joinProgram == coroutineSingletons) {
            return coroutineSingletons;
        }
        return joinProgram;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, qm0.d<Object> dVar) {
        return ((WellnessProgramJoiner$join$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
