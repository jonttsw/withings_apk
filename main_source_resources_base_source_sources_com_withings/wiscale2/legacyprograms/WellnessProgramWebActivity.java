package com.withings.wiscale2.legacyprograms;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webview.WebActivity;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
/* compiled from: WellnessProgramWebActivity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramWebActivity;", "Lcom/withings/webview/WebActivity;", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "userId$delegate", "Lnm0/g;", "getUserId", "()J", NavigationArguments.USER_ID, "", "programId$delegate", "getProgramId", "()I", NavigationArguments.PROGRAM_ID, "<init>", "()V", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramWebActivity extends WebActivity {
    private static final String EXTRA_PROGRAM_ID = "extra_program_id";
    private static final String EXTRA_USER_ID = "extra_user_id";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final g userId$delegate = h.b(new WellnessProgramWebActivity$userId$2(this));
    private final g programId$delegate = h.b(new WellnessProgramWebActivity$programId$2(this));

    /* compiled from: WellnessProgramWebActivity.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramWebActivity$Companion;", "", "()V", "EXTRA_PROGRAM_ID", "", "EXTRA_USER_ID", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", NavigationArguments.USER_ID, "", NavigationArguments.PROGRAM_ID, "", "url", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent createIntent(Context context, long j5, int i11, String url) {
            u.j(context, "context");
            u.j(url, "url");
            Intent putExtra = HMWebActivity.f35395c.c(context, "", url).setClass(context, WellnessProgramWebActivity.class).putExtra(WellnessProgramWebActivity.EXTRA_PROGRAM_ID, i11).putExtra(WellnessProgramWebActivity.EXTRA_USER_ID, j5);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }
    }

    public static final Intent createIntent(Context context, long j5, int i11, String str) {
        return Companion.createIntent(context, j5, i11, str);
    }

    private final int getProgramId() {
        return ((Number) this.programId$delegate.getValue()).intValue();
    }

    private final long getUserId() {
        return ((Number) this.userId$delegate.getValue()).longValue();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        u.j(menu, "menu");
        getMenuInflater().inflate(C1987R.menu.menu_web_program, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.withings.webview.WebActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == C1987R.id.action_leave) {
            ProgramOptionSheetFragment.Companion.newInstance(getUserId(), getProgramId()).show(getSupportFragmentManager(), "program_option_sheet");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
