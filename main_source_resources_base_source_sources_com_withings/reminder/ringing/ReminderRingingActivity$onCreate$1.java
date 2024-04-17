package com.withings.reminder.ringing;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.u0;
import com.withings.reminder.details.ReminderDetailsActivity;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderType;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import s1.b;
import yk.o;
import ym0.p;
/* compiled from: ReminderRingingActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class ReminderRingingActivity$onCreate$1 extends w implements p<a, Integer, y> {
    final /* synthetic */ ReminderRingingActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReminderRingingActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.reminder.ringing.ReminderRingingActivity$onCreate$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends w implements p<a, Integer, y> {
        final /* synthetic */ ReminderRingingActivity this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReminderRingingActivity.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.reminder.ringing.ReminderRingingActivity$onCreate$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C05961 extends w implements ym0.a<y> {
            final /* synthetic */ ReminderRingingActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C05961(ReminderRingingActivity reminderRingingActivity) {
                super(0);
                this.this$0 = reminderRingingActivity;
            }

            @Override // ym0.a
            public /* bridge */ /* synthetic */ y invoke() {
                invoke2();
                return y.f85009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReminderRingingActivity.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.reminder.ringing.ReminderRingingActivity$onCreate$1$1$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends w implements ym0.a<y> {
            final /* synthetic */ ReminderRingingActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ReminderRingingActivity reminderRingingActivity) {
                super(0);
                this.this$0 = reminderRingingActivity;
            }

            @Override // ym0.a
            public /* bridge */ /* synthetic */ y invoke() {
                invoke2();
                return y.f85009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Reminder reminder;
                reminder = this.this$0.getReminder();
                if (reminder != null) {
                    ReminderRingingActivity reminderRingingActivity = this.this$0;
                    reminderRingingActivity.startActivity(ReminderDetailsActivity.Companion.createIntent(reminderRingingActivity, reminder));
                }
                this.this$0.finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReminderRingingActivity.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.reminder.ringing.ReminderRingingActivity$onCreate$1$1$3  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends w implements ym0.a<y> {
            final /* synthetic */ ReminderRingingActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ReminderRingingActivity reminderRingingActivity) {
                super(0);
                this.this$0 = reminderRingingActivity;
            }

            @Override // ym0.a
            public /* bridge */ /* synthetic */ y invoke() {
                invoke2();
                return y.f85009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.finish();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReminderRingingActivity reminderRingingActivity) {
            super(2);
            this.this$0 = reminderRingingActivity;
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
            invoke(aVar, num.intValue());
            return y.f85009a;
        }

        public final void invoke(a aVar, int i11) {
            ReminderType reminderType;
            ReminderType reminderType2;
            if ((i11 & 11) != 2 || !aVar.h()) {
                reminderType = this.this$0.getReminderType();
                String i12 = wq.a.i((Context) aVar.D(u0.d()), reminderType.getName());
                reminderType2 = this.this$0.getReminderType();
                ReminderRingingActivityKt.ReminderRingingScreen(null, i12, wq.a.d((Context) aVar.D(u0.d()), reminderType2.getImage()), new C05961(this.this$0), new AnonymousClass2(this.this$0), new AnonymousClass3(this.this$0), aVar, 0, 1);
                return;
            }
            aVar.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderRingingActivity$onCreate$1(ReminderRingingActivity reminderRingingActivity) {
        super(2);
        this.this$0 = reminderRingingActivity;
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
            o.b(false, b.b(aVar, 482418630, new AnonymousClass1(this.this$0)), aVar, 48, 1);
        }
    }
}
