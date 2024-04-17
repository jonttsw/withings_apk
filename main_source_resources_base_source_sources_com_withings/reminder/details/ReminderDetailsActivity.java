package com.withings.reminder.details;

import android.app.AlarmManager;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.l1;
import androidx.core.view.u0;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.k;
import com.withings.android.activity.WithingsActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.R;
import com.withings.reminder.di.ReminderModule;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderRepository;
import com.withings.reminder.model.ReminderType;
import com.withings.reminder.notification.ReminderNotificationBuilder;
import com.withings.reminder.ringing.ReminderRingingActivity;
import com.withings.views.widget.DayOfWeekPickerCellView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import dq.l;
import ga.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.joda.time.DateTime;
/* compiled from: ReminderDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0007¢\u0006\u0004\b[\u0010\rJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\rR#\u0010'\u001a\n \"*\u0004\u0018\u00010!0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010,\u001a\n \"*\u0004\u0018\u00010(0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R#\u00101\u001a\n \"*\u0004\u0018\u00010-0-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u00100R#\u00106\u001a\n \"*\u0004\u0018\u000102028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u00105R#\u00109\u001a\n \"*\u0004\u0018\u000102028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b8\u00105R#\u0010<\u001a\n \"*\u0004\u0018\u000102028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b;\u00105R#\u0010A\u001a\n \"*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010$\u001a\u0004\b?\u0010@R#\u0010F\u001a\n \"*\u0004\u0018\u00010B0B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010$\u001a\u0004\bD\u0010ER#\u0010K\u001a\n \"*\u0004\u0018\u00010G0G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010$\u001a\u0004\bI\u0010JR#\u0010N\u001a\n \"*\u0004\u0018\u000102028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010$\u001a\u0004\bM\u00105R#\u0010S\u001a\n \"*\u0004\u0018\u00010O0O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010$\u001a\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\"\u0010Y\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010X0X0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006]"}, d2 = {"Lcom/withings/reminder/details/ReminderDetailsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lnm0/y;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "()V", "initViewModel", "askToSaveIfNecessary", "Lcom/withings/reminder/model/ReminderType;", "reminderType", "initViews", "(Lcom/withings/reminder/model/ReminderType;)V", "", "", ConstantsWs.RANGESTR_DAYS, "initDatePickerView", "(Ljava/util/List;)V", "showDelete", "initToolbar", "saveReminderAndClose", "checkPermissionAndSaveReminder", "askToSaveChangesBeforeFinishing", "askForConfirmationBeforeDeletingReminder", "openTimePicker", "updateTimePickerView", "Landroidx/appcompat/widget/Toolbar;", "kotlin.jvm.PlatformType", "toolbar$delegate", "Lnm0/g;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/google/android/material/appbar/AppBarLayout;", "appBar$delegate", "getAppBar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "Landroid/widget/ImageView;", "imageView$delegate", "getImageView", "()Landroid/widget/ImageView;", "imageView", "Landroid/widget/TextView;", "titleTextView$delegate", "getTitleTextView", "()Landroid/widget/TextView;", "titleTextView", "whyTextView$delegate", "getWhyTextView", "whyTextView", "whenTextView$delegate", "getWhenTextView", "whenTextView", "Lcom/withings/views/widget/DayOfWeekPickerCellView;", "datePickerView$delegate", "getDatePickerView", "()Lcom/withings/views/widget/DayOfWeekPickerCellView;", "datePickerView", "Lcom/withings/views/widget/LineCellView;", "timePickerView$delegate", "getTimePickerView", "()Lcom/withings/views/widget/LineCellView;", "timePickerView", "Landroid/widget/Button;", "saveButton$delegate", "getSaveButton", "()Landroid/widget/Button;", "saveButton", "deleteButton$delegate", "getDeleteButton", "deleteButton", "Landroidx/core/widget/NestedScrollView;", "scrollView$delegate", "getScrollView", "()Landroidx/core/widget/NestedScrollView;", "scrollView", "Lcom/withings/reminder/details/ReminderDetailsViewModel;", "viewModel", "Lcom/withings/reminder/details/ReminderDetailsViewModel;", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "permissionLauncher", "Landroidx/activity/result/b;", "<init>", "Companion", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderDetailsActivity extends WithingsActivity {
    private static final String EXTRA_REMINDER = "extra_reminder";
    private static final String EXTRA_REMINDER_TYPE = "extra_reminder_type";
    private final androidx.activity.result.b<Intent> permissionLauncher;
    private ReminderDetailsViewModel viewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final g toolbar$delegate = h.b(new ReminderDetailsActivity$toolbar$2(this));
    private final g appBar$delegate = h.b(new ReminderDetailsActivity$appBar$2(this));
    private final g imageView$delegate = h.b(new ReminderDetailsActivity$imageView$2(this));
    private final g titleTextView$delegate = h.b(new ReminderDetailsActivity$titleTextView$2(this));
    private final g whyTextView$delegate = h.b(new ReminderDetailsActivity$whyTextView$2(this));
    private final g whenTextView$delegate = h.b(new ReminderDetailsActivity$whenTextView$2(this));
    private final g datePickerView$delegate = h.b(new ReminderDetailsActivity$datePickerView$2(this));
    private final g timePickerView$delegate = h.b(new ReminderDetailsActivity$timePickerView$2(this));
    private final g saveButton$delegate = h.b(new ReminderDetailsActivity$saveButton$2(this));
    private final g deleteButton$delegate = h.b(new ReminderDetailsActivity$deleteButton$2(this));
    private final g scrollView$delegate = h.b(new ReminderDetailsActivity$scrollView$2(this));

    /* compiled from: ReminderDetailsActivity.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/withings/reminder/details/ReminderDetailsActivity$Companion;", "", "()V", "EXTRA_REMINDER", "", "EXTRA_REMINDER_TYPE", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", ReminderNotificationBuilder.NOTIFICATION_TAG, "Lcom/withings/reminder/model/Reminder;", "reminderType", "Lcom/withings/reminder/model/ReminderType;", "reminder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent createIntent(Context context, ReminderType reminderType) {
            u.j(context, "context");
            u.j(reminderType, "reminderType");
            Intent putExtra = new Intent(context, ReminderDetailsActivity.class).putExtra("extra_reminder_type", reminderType);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }

        public final Intent createIntent(Context context, Reminder reminder) {
            u.j(context, "context");
            u.j(reminder, "reminder");
            Intent putExtra = new Intent(context, ReminderDetailsActivity.class).putExtra("extra_reminder", reminder);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    public ReminderDetailsActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new wn.e(this, 1));
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.permissionLauncher = registerForActivityResult;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    private final void askForConfirmationBeforeDeletingReminder() {
        qc.b bVar = new qc.b(this);
        bVar.v(getString(C1987R.string._REMINDER_DELETE_CONFIRMATION_));
        final androidx.appcompat.app.c create = bVar.z(C1987R.string._DELETE_YES_, new l(this, 1)).w(C1987R.string._CANCEL_, new Object()).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.withings.reminder.details.c
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ReminderDetailsActivity.askForConfirmationBeforeDeletingReminder$lambda$16$lambda$15(androidx.appcompat.app.c.this, this, dialogInterface);
            }
        });
        create.show();
    }

    public static final void askForConfirmationBeforeDeletingReminder$lambda$13(ReminderDetailsActivity this$0, DialogInterface dialogInterface, int i11) {
        u.j(this$0, "this$0");
        ReminderDetailsViewModel reminderDetailsViewModel = this$0.viewModel;
        if (reminderDetailsViewModel != null) {
            reminderDetailsViewModel.deleteReminder();
            this$0.finish();
            return;
        }
        u.s("viewModel");
        throw null;
    }

    public static final void askForConfirmationBeforeDeletingReminder$lambda$16$lambda$15(androidx.appcompat.app.c this_apply, ReminderDetailsActivity this$0, DialogInterface dialogInterface) {
        u.j(this_apply, "$this_apply");
        u.j(this$0, "this$0");
        this_apply.g(-1).setTextColor(ah.u.w(C1987R.attr.colorError, this$0, -65281));
    }

    private final void askToSaveChangesBeforeFinishing() {
        qc.b bVar = new qc.b(this);
        bVar.g(C1987R.string._SAVE_CHANGES_CONFIRMATION_);
        qc.b z5 = bVar.z(C1987R.string._SAVE_, new a(this, 0));
        z5.x(C1987R.string._CANCEL_, null);
        z5.w(C1987R.string._IGNORE_CHANGES_, new vn.c(this, 1)).s();
    }

    public static final void askToSaveChangesBeforeFinishing$lambda$11(ReminderDetailsActivity this$0, DialogInterface dialogInterface, int i11) {
        u.j(this$0, "this$0");
        this$0.checkPermissionAndSaveReminder();
        this$0.setResult(-1);
        this$0.finish();
    }

    public static final void askToSaveChangesBeforeFinishing$lambda$12(ReminderDetailsActivity this$0, DialogInterface dialogInterface, int i11) {
        u.j(this$0, "this$0");
        this$0.setResult(0);
        this$0.finish();
    }

    private final void askToSaveIfNecessary() {
        ReminderDetailsViewModel reminderDetailsViewModel = this.viewModel;
        if (reminderDetailsViewModel != null) {
            if (reminderDetailsViewModel.getHasChanged()) {
                askToSaveChangesBeforeFinishing();
                return;
            } else {
                finish();
                return;
            }
        }
        u.s("viewModel");
        throw null;
    }

    private final void checkPermissionAndSaveReminder() {
        AlarmManager alarmManager;
        boolean canScheduleExactAlarms;
        Object systemService = getSystemService("alarm");
        if (systemService instanceof AlarmManager) {
            alarmManager = (AlarmManager) systemService;
        } else {
            alarmManager = null;
        }
        if (Build.VERSION.SDK_INT >= 31 && alarmManager != null) {
            canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
            if (!canScheduleExactAlarms) {
                qc.b bVar = new qc.b(this);
                bVar.g(C1987R.string.permission_access_alarmsAndReminders_title);
                bVar.z(C1987R.string._YES_, new iq.c(this, 1)).w(C1987R.string._NO_, new cq.d(this, 1)).s();
                return;
            }
        }
        saveReminderAndClose();
    }

    public static final void checkPermissionAndSaveReminder$lambda$10(ReminderDetailsActivity this$0, DialogInterface dialogInterface, int i11) {
        u.j(this$0, "this$0");
        this$0.saveReminderAndClose();
    }

    public static final void checkPermissionAndSaveReminder$lambda$9(ReminderDetailsActivity this$0, DialogInterface dialogInterface, int i11) {
        u.j(this$0, "this$0");
        Intent intent = new Intent();
        intent.setAction("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
        this$0.permissionLauncher.a(intent);
    }

    public static final Intent createIntent(Context context, Reminder reminder) {
        return Companion.createIntent(context, reminder);
    }

    public final AppBarLayout getAppBar() {
        return (AppBarLayout) this.appBar$delegate.getValue();
    }

    private final DayOfWeekPickerCellView getDatePickerView() {
        return (DayOfWeekPickerCellView) this.datePickerView$delegate.getValue();
    }

    private final TextView getDeleteButton() {
        return (TextView) this.deleteButton$delegate.getValue();
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView$delegate.getValue();
    }

    private final Button getSaveButton() {
        return (Button) this.saveButton$delegate.getValue();
    }

    public final NestedScrollView getScrollView() {
        return (NestedScrollView) this.scrollView$delegate.getValue();
    }

    private final LineCellView getTimePickerView() {
        return (LineCellView) this.timePickerView$delegate.getValue();
    }

    private final TextView getTitleTextView() {
        return (TextView) this.titleTextView$delegate.getValue();
    }

    public final Toolbar getToolbar() {
        return (Toolbar) this.toolbar$delegate.getValue();
    }

    private final TextView getWhenTextView() {
        return (TextView) this.whenTextView$delegate.getValue();
    }

    private final TextView getWhyTextView() {
        return (TextView) this.whyTextView$delegate.getValue();
    }

    public final void initDatePickerView(List<Integer> list) {
        getDatePickerView().setSelectedDays(list);
        getDatePickerView().setOnSelectionChangedListener(new iq.a(this));
    }

    public static final void initDatePickerView$lambda$4(ReminderDetailsActivity this$0, List list) {
        u.j(this$0, "this$0");
        ReminderDetailsViewModel reminderDetailsViewModel = this$0.viewModel;
        if (reminderDetailsViewModel != null) {
            reminderDetailsViewModel.setModifiedDays(list);
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    private final void initToolbar() {
        final Drawable drawable = androidx.core.content.a.getDrawable(this, C1987R.drawable.ic_utilitary_backandroid_black_24dp);
        setSupportActionBar(getToolbar());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.s(drawable);
        }
        AppBarLayout appBar = getAppBar();
        u.i(appBar, "<get-appBar>(...)");
        ay.b.n(appBar, true, false, 29);
        ImageView imageView = getImageView();
        u.i(imageView, "<get-imageView>(...)");
        if (u0.L(imageView) && !imageView.isLayoutRequested()) {
            AppBarLayout appBar2 = getAppBar();
            NestedScrollView scrollView = getScrollView();
            int measuredHeight = imageView.getMeasuredHeight();
            Context context = getAppBar().getContext();
            u.i(context, "getContext(...)");
            Window window = getWindow();
            u.i(window, "getWindow(...)");
            Toolbar toolbar = getToolbar();
            u.i(toolbar, "access$getToolbar(...)");
            j80.h hVar = new j80.h(context, window, toolbar, x.X(drawable));
            u.g(appBar2);
            u.g(scrollView);
            j80.e.b(scrollView, appBar2, hVar, Integer.valueOf(measuredHeight));
            return;
        }
        imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withings.reminder.details.ReminderDetailsActivity$initToolbar$$inlined$doOnLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                view.removeOnLayoutChangeListener(this);
                AppBarLayout appBar3 = ReminderDetailsActivity.this.getAppBar();
                NestedScrollView scrollView2 = ReminderDetailsActivity.this.getScrollView();
                int measuredHeight2 = view.getMeasuredHeight();
                Context context2 = ReminderDetailsActivity.this.getAppBar().getContext();
                u.i(context2, "getContext(...)");
                Window window2 = ReminderDetailsActivity.this.getWindow();
                u.i(window2, "getWindow(...)");
                Toolbar toolbar2 = ReminderDetailsActivity.this.getToolbar();
                u.i(toolbar2, "access$getToolbar(...)");
                j80.h hVar2 = new j80.h(context2, window2, toolbar2, x.X(drawable));
                u.g(appBar3);
                u.g(scrollView2);
                j80.e.b(scrollView2, appBar3, hVar2, Integer.valueOf(measuredHeight2));
            }
        });
    }

    private final void initViewModel() {
        ReminderDetailsViewModel reminderDetailsViewModel = (ReminderDetailsViewModel) new k1(this, new k1.b() { // from class: com.withings.reminder.details.ReminderDetailsActivity$initViewModel$$inlined$withViewModel$1
            @Override // androidx.lifecycle.k1.b
            public /* bridge */ /* synthetic */ g1 create(Class cls, i6.a aVar) {
                return super.create(cls, aVar);
            }

            @Override // androidx.lifecycle.k1.b
            public <U extends g1> U create(Class<U> modelClass) {
                Object parcelableExtra;
                Object parcelableExtra2;
                u.j(modelClass, "modelClass");
                ReminderRepository reminderRepository = ReminderModule.INSTANCE.getReminderRepository();
                Intent intent = ReminderDetailsActivity.this.getIntent();
                u.i(intent, "getIntent(...)");
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    parcelableExtra = intent.getParcelableExtra(ReminderRingingActivity.EXTRA_REMINDER, Reminder.class);
                } else {
                    parcelableExtra = intent.getParcelableExtra(ReminderRingingActivity.EXTRA_REMINDER);
                }
                Reminder reminder = (Reminder) parcelableExtra;
                Intent intent2 = ReminderDetailsActivity.this.getIntent();
                u.i(intent2, "getIntent(...)");
                if (i11 >= 33) {
                    parcelableExtra2 = intent2.getParcelableExtra(ReminderRingingActivity.EXTRA_REMINDER_TYPE, ReminderType.class);
                } else {
                    parcelableExtra2 = intent2.getParcelableExtra(ReminderRingingActivity.EXTRA_REMINDER_TYPE);
                }
                return new ReminderDetailsViewModel(reminderRepository, reminder, (ReminderType) parcelableExtra2);
            }
        }).a(ReminderDetailsViewModel.class);
        xw.d.c(this, reminderDetailsViewModel.getReminderType(), new ReminderDetailsActivity$initViewModel$2$1(this));
        xw.d.c(this, reminderDetailsViewModel.getShouldShowDelete(), new ReminderDetailsActivity$initViewModel$2$2(this));
        xw.d.c(this, reminderDetailsViewModel.getPreviousDays(), new ReminderDetailsActivity$initViewModel$2$3(this));
        this.viewModel = reminderDetailsViewModel;
    }

    public final void initViews(ReminderType reminderType) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(wq.a.i(this, reminderType.getName()));
        }
        ImageView imageView = getImageView();
        u.i(imageView, "<get-imageView>(...)");
        Integer valueOf = Integer.valueOf(wq.a.d(this, reminderType.getImage()));
        w9.g a11 = w9.a.a(imageView.getContext());
        f.a aVar = new f.a(imageView.getContext());
        aVar.d(valueOf);
        aVar.q(imageView);
        a11.d(aVar.b());
        getTitleTextView().setText(wq.a.i(this, reminderType.getName()));
        getWhyTextView().setText(wq.a.i(this, reminderType.getInfo1()));
        getWhenTextView().setText(wq.a.i(this, reminderType.getInfo2()));
        getSaveButton().setOnClickListener(new sg.f(this, 5));
        getTimePickerView().setOnClickListener(new sg.g(this, 4));
        updateTimePickerView();
    }

    public static final void initViews$lambda$2(ReminderDetailsActivity this$0, View view) {
        u.j(this$0, "this$0");
        this$0.checkPermissionAndSaveReminder();
    }

    public static final void initViews$lambda$3(ReminderDetailsActivity this$0, View view) {
        u.j(this$0, "this$0");
        this$0.openTimePicker();
    }

    private final void openTimePicker() {
        ReminderDetailsViewModel reminderDetailsViewModel = this.viewModel;
        if (reminderDetailsViewModel != null) {
            int hourOfDay = reminderDetailsViewModel.getCurrentTime().getHourOfDay();
            ReminderDetailsViewModel reminderDetailsViewModel2 = this.viewModel;
            if (reminderDetailsViewModel2 != null) {
                new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() { // from class: com.withings.reminder.details.d
                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                    public final void onTimeSet(TimePicker timePicker, int i11, int i12) {
                        ReminderDetailsActivity.openTimePicker$lambda$17(ReminderDetailsActivity.this, timePicker, i11, i12);
                    }
                }, hourOfDay, reminderDetailsViewModel2.getCurrentTime().getMinuteOfHour(), DateFormat.is24HourFormat(this)).show();
                return;
            }
            u.s("viewModel");
            throw null;
        }
        u.s("viewModel");
        throw null;
    }

    public static final void openTimePicker$lambda$17(ReminderDetailsActivity this$0, TimePicker timePicker, int i11, int i12) {
        u.j(this$0, "this$0");
        ReminderDetailsViewModel reminderDetailsViewModel = this$0.viewModel;
        if (reminderDetailsViewModel != null) {
            reminderDetailsViewModel.setModifiedTime(DateTime.now().withHourOfDay(i11).withMinuteOfHour(i12));
            this$0.updateTimePickerView();
            return;
        }
        u.s("viewModel");
        throw null;
    }

    public static final void permissionLauncher$lambda$7(ReminderDetailsActivity this$0, ActivityResult activityResult) {
        u.j(this$0, "this$0");
        this$0.saveReminderAndClose();
    }

    private final void saveReminderAndClose() {
        ReminderDetailsViewModel reminderDetailsViewModel = this.viewModel;
        if (reminderDetailsViewModel != null) {
            reminderDetailsViewModel.saveReminder();
            setResult(-1);
            finish();
            return;
        }
        u.s("viewModel");
        throw null;
    }

    public final void showDelete() {
        getDeleteButton().setVisibility(0);
        getDeleteButton().setOnClickListener(new k(this, 5));
    }

    public static final void showDelete$lambda$5(ReminderDetailsActivity this$0, View view) {
        u.j(this$0, "this$0");
        this$0.askForConfirmationBeforeDeletingReminder();
    }

    private final void updateTimePickerView() {
        LineCellView timePickerView = getTimePickerView();
        ReminderDetailsViewModel reminderDetailsViewModel = this.viewModel;
        if (reminderDetailsViewModel != null) {
            timePickerView.setValue(b50.b.t(this, reminderDetailsViewModel.getCurrentTime()));
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        askToSaveIfNecessary();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        setContentView(R.layout.activity_reminder_details);
        initToolbar();
        NestedScrollView scrollView = getScrollView();
        u.i(scrollView, "<get-scrollView>(...)");
        ay.b.n(scrollView, false, true, 23);
        initViewModel();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            askToSaveIfNecessary();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static final Intent createIntent(Context context, ReminderType reminderType) {
        return Companion.createIntent(context, reminderType);
    }
}
