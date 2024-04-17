package com.withings.authentication.mfa.phone;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import nm0.l;
import nm0.y;
import qm0.d;
import th.f;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsPhoneAuthViewModel.kt */
@e(c = "com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel$checkConfirmationCode$1", f = "SettingsPhoneAuthViewModel.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31796a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsPhoneAuthViewModel f31797b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f31798c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsPhoneAuthViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingsPhoneAuthViewModel f31799a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SettingsPhoneAuthViewModel.kt */
        @e(c = "com.withings.authentication.mfa.phone.SettingsPhoneAuthViewModel$checkConfirmationCode$1$1", f = "SettingsPhoneAuthViewModel.kt", l = {103, 107, 112, 117, 120, 124}, m = "emit")
        /* renamed from: com.withings.authentication.mfa.phone.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0416a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            Object f31800a;

            /* renamed from: b  reason: collision with root package name */
            f.a f31801b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f31802c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a<T> f31803d;

            /* renamed from: e  reason: collision with root package name */
            int f31804e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0416a(a<? super T> aVar, d<? super C0416a> dVar) {
                super(dVar);
                this.f31803d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f31802c = obj;
                this.f31804e |= Integer.MIN_VALUE;
                return this.f31803d.emit(null, this);
            }
        }

        a(SettingsPhoneAuthViewModel settingsPhoneAuthViewModel) {
            this.f31799a = settingsPhoneAuthViewModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(th.f.a r6, qm0.d<? super nm0.y> r7) {
            /*
                Method dump skipped, instructions count: 380
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.phone.c.a.emit(th.f$a, qm0.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SettingsPhoneAuthViewModel settingsPhoneAuthViewModel, String str, d<? super c> dVar) {
        super(2, dVar);
        this.f31797b = settingsPhoneAuthViewModel;
        this.f31798c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new c(this.f31797b, this.f31798c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        f fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f31796a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            SettingsPhoneAuthViewModel settingsPhoneAuthViewModel = this.f31797b;
            mutableStateFlow = settingsPhoneAuthViewModel.f31771j;
            mutableStateFlow.setValue(Boolean.TRUE);
            fVar = settingsPhoneAuthViewModel.f31764c;
            Flow<f.a> b10 = fVar.b(this.f31798c);
            a aVar = new a(settingsPhoneAuthViewModel);
            this.f31796a = 1;
            if (b10.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
