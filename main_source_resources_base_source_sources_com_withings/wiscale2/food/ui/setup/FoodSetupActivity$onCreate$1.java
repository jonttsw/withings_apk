package com.withings.wiscale2.food.ui.setup;

import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: FoodSetupActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.wiscale2.food.ui.setup.FoodSetupActivity$onCreate$1", f = "FoodSetupActivity.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class FoodSetupActivity$onCreate$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    int label;
    final /* synthetic */ FoodSetupActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodSetupActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.withings.wiscale2.food.ui.setup.FoodSetupActivity$onCreate$1$1", f = "FoodSetupActivity.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.food.ui.setup.FoodSetupActivity$onCreate$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends i implements p<CoroutineScope, d<? super y>, Object> {
        int label;
        final /* synthetic */ FoodSetupActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FoodSetupActivity foodSetupActivity, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = foodSetupActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.navigation.e navController;
            boolean showAgreement;
            int i11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i12 = this.label;
            if (i12 != 0) {
                if (i12 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                FoodSetupActivity$onCreate$1$1$linkedToMyFitnessPal$1 foodSetupActivity$onCreate$1$1$linkedToMyFitnessPal$1 = new FoodSetupActivity$onCreate$1$1$linkedToMyFitnessPal$1(this.this$0, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, foodSetupActivity$onCreate$1$1$linkedToMyFitnessPal$1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (!((Boolean) obj).booleanValue()) {
                this.this$0.initToolbar();
                navController = this.this$0.getNavController();
                showAgreement = this.this$0.getShowAgreement();
                if (showAgreement) {
                    i11 = C1987R.id.food_setup_agreement;
                } else {
                    i11 = C1987R.id.food_setup_connexion;
                }
                navController.H(i11, null);
            } else {
                this.this$0.finish();
                u70.e.c(this.this$0, Partner.f43455m.d(), null, Uri.parse("mfp://mfp/diary"));
            }
            return y.f85009a;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodSetupActivity$onCreate$1(FoodSetupActivity foodSetupActivity, d<? super FoodSetupActivity$onCreate$1> dVar) {
        super(2, dVar);
        this.this$0 = foodSetupActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new FoodSetupActivity$onCreate$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            Lifecycle lifecycle = this.this$0.getLifecycle();
            u.i(lifecycle, "<get-lifecycle>(...)");
            Lifecycle.State state = Lifecycle.State.f14374c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((FoodSetupActivity$onCreate$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
