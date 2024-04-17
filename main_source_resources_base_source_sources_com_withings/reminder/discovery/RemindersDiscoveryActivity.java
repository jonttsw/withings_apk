package com.withings.reminder.discovery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.b;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.l1;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.android.activity.WithingsActivity;
import com.withings.authentication.n;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.R;
import com.withings.reminder.details.ReminderDetailsActivity;
import com.withings.reminder.di.ReminderModule;
import com.withings.reminder.discovery.views.Listener;
import com.withings.reminder.model.ReminderType;
import cq.f;
import g.a;
import j80.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smackx.amp.packet.AMPExtension;
import xw.d;
/* compiled from: RemindersDiscoveryActivity.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b)\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001f\u001a\n \u0015*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R\"\u0010'\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010&0&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/withings/reminder/discovery/RemindersDiscoveryActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/reminder/discovery/views/Listener;", "Lnm0/y;", "initViews", "()V", "initToolbar", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/withings/reminder/model/ReminderType;", "reminderType", "onReminderTypeClicked", "(Lcom/withings/reminder/model/ReminderType;)V", "Landroidx/appcompat/widget/Toolbar;", "kotlin.jvm.PlatformType", "toolbar$delegate", "Lnm0/g;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerview$delegate", "getRecyclerview", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerview", "Lcom/withings/reminder/discovery/ReminderCategoriesAdapter;", "categoriesAdapter$delegate", "getCategoriesAdapter", "()Lcom/withings/reminder/discovery/ReminderCategoriesAdapter;", "categoriesAdapter", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "reminderTypeClicked", "Landroidx/activity/result/b;", "<init>", "Companion", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemindersDiscoveryActivity extends WithingsActivity implements Listener {
    private static final String EXTRA_ACTION = "extra_action";
    private static final String EXTRA_REMINDER_ID = "extra_id";
    private final b<Intent> reminderTypeClicked;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final g toolbar$delegate = h.b(new RemindersDiscoveryActivity$toolbar$2(this));
    private final g recyclerview$delegate = h.b(new RemindersDiscoveryActivity$recyclerview$2(this));
    private final g categoriesAdapter$delegate = h.b(new RemindersDiscoveryActivity$categoriesAdapter$2(this));

    /* compiled from: RemindersDiscoveryActivity.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/withings/reminder/discovery/RemindersDiscoveryActivity$Companion;", "", "()V", "EXTRA_ACTION", "", "EXTRA_REMINDER_ID", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", AMPExtension.Action.ATTRIBUTE_NAME, "id", "reminder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent createIntent(Context context) {
            return n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, RemindersDiscoveryActivity.class);
        }

        private Companion() {
        }

        public final Intent createIntent(Context context, String str, String str2) {
            Intent putExtra = n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, RemindersDiscoveryActivity.class).putExtra(RemindersDiscoveryActivity.EXTRA_ACTION, str).putExtra(RemindersDiscoveryActivity.EXTRA_REMINDER_ID, str2);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    public RemindersDiscoveryActivity() {
        b<Intent> registerForActivityResult = registerForActivityResult(new a(), new f(this, 2));
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.reminderTypeClicked = registerForActivityResult;
    }

    public final ReminderCategoriesAdapter getCategoriesAdapter() {
        return (ReminderCategoriesAdapter) this.categoriesAdapter$delegate.getValue();
    }

    private final RecyclerView getRecyclerview() {
        return (RecyclerView) this.recyclerview$delegate.getValue();
    }

    private final Toolbar getToolbar() {
        return (Toolbar) this.toolbar$delegate.getValue();
    }

    private final void initToolbar() {
        setSupportActionBar(getToolbar());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
    }

    private final void initViews() {
        initToolbar();
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        u.g(appBarLayout);
        ay.b.n(appBarLayout, true, false, 29);
        RecyclerView recyclerview = getRecyclerview();
        u.i(recyclerview, "<get-recyclerview>(...)");
        Context context = appBarLayout.getContext();
        u.i(context, "getContext(...)");
        e.a(appBarLayout, recyclerview, new j80.g(context));
        RecyclerView recyclerview2 = getRecyclerview();
        u.i(recyclerview2, "<get-recyclerview>(...)");
        ay.b.n(recyclerview2, false, true, 23);
        getRecyclerview().setLayoutManager(new LinearLayoutManager(1));
        getRecyclerview().setAdapter(getCategoriesAdapter());
    }

    public static final void reminderTypeClicked$lambda$0(RemindersDiscoveryActivity this$0, ActivityResult activityResult) {
        u.j(this$0, "this$0");
        if (activityResult.b() == -1) {
            this$0.setResult(-1);
            this$0.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        setContentView(R.layout.activity_reminders_discovery);
        initViews();
        d.c(this, ((RemindersDiscoveryViewModel) new k1(this, new k1.b() { // from class: com.withings.reminder.discovery.RemindersDiscoveryActivity$onCreate$$inlined$withViewModel$1
            @Override // androidx.lifecycle.k1.b
            public /* bridge */ /* synthetic */ g1 create(Class cls, i6.a aVar) {
                return super.create(cls, aVar);
            }

            @Override // androidx.lifecycle.k1.b
            public <U extends g1> U create(Class<U> modelClass) {
                u.j(modelClass, "modelClass");
                return new RemindersDiscoveryViewModel(ReminderModule.INSTANCE.getReminderRepository());
            }
        }).a(RemindersDiscoveryViewModel.class)).getRemindersByCategory(), new RemindersDiscoveryActivity$onCreate$2$1(this));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.withings.reminder.discovery.views.Listener
    public void onReminderTypeClicked(ReminderType reminderType) {
        u.j(reminderType, "reminderType");
        this.reminderTypeClicked.a(ReminderDetailsActivity.Companion.createIntent(this, reminderType));
    }
}
