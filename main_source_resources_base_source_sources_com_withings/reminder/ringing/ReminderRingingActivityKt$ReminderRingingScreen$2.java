package com.withings.reminder.ringing;

import androidx.compose.foundation.layout.e1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import ay.b;
import com.withings.common.compose.component.l;
import com.withings.common.compose.component.l2;
import com.withings.wiscale2.C1987R;
import d1.g;
import k1.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import wk.i;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReminderRingingActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderRingingActivityKt$ReminderRingingScreen$2 extends w implements p<a, Integer, y> {
    final /* synthetic */ r0<Boolean> $muteLoading$delegate;
    final /* synthetic */ ym0.a<y> $onReminderDone;
    final /* synthetic */ ReminderRingingViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReminderRingingActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.reminder.ringing.ReminderRingingActivityKt$ReminderRingingScreen$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends w implements p<a, Integer, y> {
        final /* synthetic */ ym0.a<y> $onReminderDone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ym0.a<y> aVar) {
            super(2);
            this.$onReminderDone = aVar;
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
            invoke(aVar, num.intValue());
            return y.f85009a;
        }

        public final void invoke(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.h()) {
                aVar.C();
                return;
            }
            l.a(e1.e(e.f8927a, 1.0f), b.u(C1987R.string._RMNDR_DONE_, aVar), new l2.a(g.a()), false, null, null, false, this.$onReminderDone, aVar, 6, 120);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReminderRingingActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.reminder.ringing.ReminderRingingActivityKt$ReminderRingingScreen$2$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends w implements p<a, Integer, y> {
        final /* synthetic */ r0<Boolean> $muteLoading$delegate;
        final /* synthetic */ ReminderRingingViewModel $viewModel;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReminderRingingActivity.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.reminder.ringing.ReminderRingingActivityKt$ReminderRingingScreen$2$2$1  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends w implements ym0.a<y> {
            final /* synthetic */ r0<Boolean> $muteLoading$delegate;
            final /* synthetic */ ReminderRingingViewModel $viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ReminderRingingViewModel reminderRingingViewModel, r0<Boolean> r0Var) {
                super(0);
                this.$viewModel = reminderRingingViewModel;
                this.$muteLoading$delegate = r0Var;
            }

            @Override // ym0.a
            public /* bridge */ /* synthetic */ y invoke() {
                invoke2();
                return y.f85009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ReminderRingingActivityKt.ReminderRingingScreen$lambda$2(this.$muteLoading$delegate, true);
                this.$viewModel.onMuteClicked();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(r0<Boolean> r0Var, ReminderRingingViewModel reminderRingingViewModel) {
            super(2);
            this.$muteLoading$delegate = r0Var;
            this.$viewModel = reminderRingingViewModel;
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
            invoke(aVar, num.intValue());
            return y.f85009a;
        }

        public final void invoke(a aVar, int i11) {
            boolean ReminderRingingScreen$lambda$1;
            if ((i11 & 11) == 2 && aVar.h()) {
                aVar.C();
                return;
            }
            e e11 = e1.e(e.f8927a, 1.0f);
            ReminderRingingScreen$lambda$1 = ReminderRingingActivityKt.ReminderRingingScreen$lambda$1(this.$muteLoading$delegate);
            l.c(e11, b.u(C1987R.string._REMINDER_MUTE_FOR_TODAY_, aVar), null, false, null, null, ReminderRingingScreen$lambda$1, new AnonymousClass1(this.$viewModel, this.$muteLoading$delegate), aVar, 6, 60);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderRingingActivityKt$ReminderRingingScreen$2(ym0.a<y> aVar, r0<Boolean> r0Var, ReminderRingingViewModel reminderRingingViewModel) {
        super(2);
        this.$onReminderDone = aVar;
        this.$muteLoading$delegate = r0Var;
        this.$viewModel = reminderRingingViewModel;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
        } else {
            i.a(e1.e(e.f8927a, 1.0f), false, s1.b.b(aVar, -182554197, new AnonymousClass1(this.$onReminderDone)), s1.b.b(aVar, 1111864650, new AnonymousClass2(this.$muteLoading$delegate, this.$viewModel)), aVar, 3462, 2);
        }
    }
}
