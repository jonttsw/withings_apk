package com.withings.wiscale2.legacyprograms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k0;
import androidx.viewpager.widget.ViewPager;
import com.withings.android.activity.WithingsActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.program.ScreenshotDomain;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
/* compiled from: WellnessProgramScreenshotsActivity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R#\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramScreenshotsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lnm0/y;", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/viewpager/widget/ViewPager;", "kotlin.jvm.PlatformType", "pager$delegate", "Lnm0/g;", "getPager", "()Landroidx/viewpager/widget/ViewPager;", "pager", "Landroid/widget/ImageView;", "closeButton$delegate", "getCloseButton", "()Landroid/widget/ImageView;", "closeButton", "<init>", "()V", "Companion", "ScreenshotAdapter", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramScreenshotsActivity extends WithingsActivity {
    public static final String EXTRA_POSITION = "extra_position";
    public static final String EXTRA_SCREENSHOTS = "extra_screenshots";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final g pager$delegate = h.b(new WellnessProgramScreenshotsActivity$pager$2(this));
    private final g closeButton$delegate = h.b(new WellnessProgramScreenshotsActivity$closeButton$2(this));

    /* compiled from: WellnessProgramScreenshotsActivity.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramScreenshotsActivity$Companion;", "", "()V", "EXTRA_POSITION", "", "EXTRA_SCREENSHOTS", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "screenshots", "Ljava/util/ArrayList;", "Lcom/withings/programs/model/program/ScreenshotDomain;", "Lkotlin/collections/ArrayList;", "position", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent createIntent(Context context, ArrayList<ScreenshotDomain> screenshots, int i11) {
            u.j(context, "context");
            u.j(screenshots, "screenshots");
            Intent intent = new Intent(context, WellnessProgramScreenshotsActivity.class);
            ArrayList arrayList = new ArrayList(x.y(screenshots, 10));
            for (ScreenshotDomain screenshotDomain : screenshots) {
                arrayList.add(screenshotDomain.getImage());
            }
            Intent putExtra = intent.putExtra(WellnessProgramScreenshotsActivity.EXTRA_SCREENSHOTS, (String[]) arrayList.toArray(new String[0])).putExtra(WellnessProgramScreenshotsActivity.EXTRA_POSITION, i11);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }
    }

    /* compiled from: WellnessProgramScreenshotsActivity.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramScreenshotsActivity$ScreenshotAdapter;", "Landroidx/fragment/app/k0;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "(I)Landroidx/fragment/app/Fragment;", "getCount", "()I", "", "", "screenshotsUrl", "[Ljava/lang/String;", "getScreenshotsUrl", "()[Ljava/lang/String;", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroidx/fragment/app/FragmentManager;[Ljava/lang/String;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class ScreenshotAdapter extends k0 {
        public static final int $stable = 8;
        private final String[] screenshotsUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenshotAdapter(FragmentManager fm2, String[] screenshotsUrl) {
            super(fm2, 1);
            u.j(fm2, "fm");
            u.j(screenshotsUrl, "screenshotsUrl");
            this.screenshotsUrl = screenshotsUrl;
        }

        @Override // androidx.viewpager.widget.e
        public int getCount() {
            return this.screenshotsUrl.length;
        }

        @Override // androidx.fragment.app.k0
        public Fragment getItem(int i11) {
            return ScreenshotFragment.Companion.newInstance(this.screenshotsUrl[i11]);
        }

        public final String[] getScreenshotsUrl() {
            return this.screenshotsUrl;
        }
    }

    private final ImageView getCloseButton() {
        return (ImageView) this.closeButton$delegate.getValue();
    }

    private final ViewPager getPager() {
        return (ViewPager) this.pager$delegate.getValue();
    }

    public static final void onCreate$lambda$0(WellnessProgramScreenshotsActivity this$0, View view) {
        u.j(this$0, "this$0");
        this$0.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(C1987R.layout.activity_wellness_program_screenshot);
        getCloseButton().setOnClickListener(new dq.a(this, 9));
        ViewPager pager = getPager();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        String[] stringArrayExtra = getIntent().getStringArrayExtra(EXTRA_SCREENSHOTS);
        u.g(stringArrayExtra);
        pager.setAdapter(new ScreenshotAdapter(supportFragmentManager, stringArrayExtra));
        getPager().setCurrentItem(getIntent().getIntExtra(EXTRA_POSITION, 0));
    }
}
