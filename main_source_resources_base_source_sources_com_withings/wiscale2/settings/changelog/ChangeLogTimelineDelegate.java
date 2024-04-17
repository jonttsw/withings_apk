package com.withings.wiscale2.settings.changelog;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.a0;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.appVersion.changelog.HtmlChangelogHelper;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.timeline.data.TimelineItem;
import com.withings.user.User;
import com.withings.webservices.legacy.withings.model.timeline.TextItemData;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
import u70.f;
import ww.b;
/* compiled from: ChangeLogTimelineDelegate.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020&2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/withings/wiscale2/settings/changelog/ChangeLogTimelineDelegate;", "Lww/b$e;", "Lcom/withings/webservices/legacy/withings/model/timeline/TextItemData;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lnm0/y;", "showInhouseChangelog", "(Landroid/content/Context;)V", "Lcom/withings/library/timeline/data/TimelineItem;", "releaseNoteTimelineItem", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lww/b;", "timelineManager", "insertReleaseNoteTimelineItem", "(Lcom/withings/library/timeline/data/TimelineItem;Lcom/withings/user/User;Lww/b;)V", "Lcom/withings/appVersion/changelog/HtmlChangelogHelper$ReleaseNoteInfo;", "releaseNoteInfo", "showProdChangelog", "(Landroid/content/Context;Lcom/withings/appVersion/changelog/HtmlChangelogHelper$ReleaseNoteInfo;)V", "releaseNote", "getReleaseNoteTimelineItem", "(Landroid/content/Context;Lcom/withings/appVersion/changelog/HtmlChangelogHelper$ReleaseNoteInfo;)Lcom/withings/library/timeline/data/TimelineItem;", "", "getDefaultContentMessage", "(Landroid/content/Context;)Ljava/lang/String;", "showChangelogIfNecessary", "(Landroid/content/Context;Lww/b;Lcom/withings/user/User;)V", "Lu70/f;", "getSerializer", "()Lu70/f;", "getManagedType", "()Ljava/lang/String;", "", NavigationArguments.USER_ID, "item", "onTimelineItemDeleted", "(JLcom/withings/library/timeline/data/TimelineItem;)V", "", "softDeleteItem", "(Lcom/withings/library/timeline/data/TimelineItem;)Z", "<init>", "()V", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ChangeLogTimelineDelegate implements b.e<TextItemData> {
    public static final int $stable = 0;
    private static final String APP_NAME = "healthmate";
    public static final Companion Companion = new Companion(null);
    private static final String GLYPH_NAME_INFO = "info";

    /* compiled from: ChangeLogTimelineDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/settings/changelog/ChangeLogTimelineDelegate$Companion;", "", "()V", "APP_NAME", "", "GLYPH_NAME_INFO", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    private final String getDefaultContentMessage(Context context) {
        String string = context.getString(C1987R.string.__s_NOTIFICATION_APP_UPGRADE_);
        u.i(string, "getString(...)");
        return String.format(string, Arrays.copyOf(new Object[]{context.getString(C1987R.string._APP_NAME_)}, 1));
    }

    private final TimelineItem<TextItemData> getReleaseNoteTimelineItem(Context context, HtmlChangelogHelper.ReleaseNoteInfo releaseNoteInfo) {
        boolean z5;
        TimelineItem<TextItemData> timelineItem = new TimelineItem<>("webservice", a0.b("release_note-", releaseNoteInfo.version), DateTime.now());
        TextItemData textItemData = new TextItemData();
        String str = releaseNoteInfo.title;
        if (str != null && str.length() != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        String str2 = null;
        if (z5) {
            str = null;
        }
        if (str == null) {
            str = context.getString(C1987R.string._UPDATE_APP_ITEM_);
        }
        textItemData.title = str;
        String str3 = releaseNoteInfo.message;
        if (str3 == null || str3.length() == 0) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = getDefaultContentMessage(context);
        }
        textItemData.message = str3;
        textItemData.imageUrl = releaseNoteInfo.img;
        textItemData.labelTitle = releaseNoteInfo.labelTitle;
        textItemData.labelHexcolor = releaseNoteInfo.labelHexcolor;
        textItemData.hexcolor = releaseNoteInfo.hexcolor;
        TextItemData.Details details = new TextItemData.Details();
        HtmlChangelogHelper.Details details2 = releaseNoteInfo.details;
        details.type = details2.type;
        details.content = details2.content;
        textItemData.details = details;
        String str4 = releaseNoteInfo.glyph;
        if (str4 != null && str4.length() != 0) {
            str2 = str4;
        }
        if (str2 == null) {
            str2 = GLYPH_NAME_INFO;
        }
        textItemData.glyphName = str2;
        timelineItem.q(textItemData);
        timelineItem.t(true);
        String[] f11 = timelineItem.f();
        u.i(f11, "getSectionTags(...)");
        if (!l.m(f11, ConstantsWs.APP_SECTION_NOTIFICATIONS)) {
            String[] f12 = timelineItem.f();
            u.i(f12, "getSectionTags(...)");
            int length = f12.length;
            Object[] copyOf = Arrays.copyOf(f12, length + 1);
            copyOf[length] = ConstantsWs.APP_SECTION_NOTIFICATIONS;
            timelineItem.u((String[]) copyOf);
        }
        return timelineItem;
    }

    private final void insertReleaseNoteTimelineItem(TimelineItem<TextItemData> timelineItem, User user, b bVar) {
        if (user != null) {
            BuildersKt.runBlocking(Dispatchers.getIO(), new ChangeLogTimelineDelegate$insertReleaseNoteTimelineItem$1$1(bVar, user, timelineItem, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showChangelogIfNecessary$lambda$0(ChangeLogTimelineDelegate this$0, Context context, User user, b timelineManager, HtmlChangelogHelper.ReleaseNoteInfo releaseNoteInfo) {
        u.j(this$0, "this$0");
        u.j(context, "$context");
        u.j(timelineManager, "$timelineManager");
        u.g(releaseNoteInfo);
        this$0.insertReleaseNoteTimelineItem(this$0.getReleaseNoteTimelineItem(context, releaseNoteInfo), user, timelineManager);
        this$0.showProdChangelog(context, releaseNoteInfo);
    }

    private final void showInhouseChangelog(Context context) {
        new mb0.a(context).a();
    }

    private final void showProdChangelog(Context context, HtmlChangelogHelper.ReleaseNoteInfo releaseNoteInfo) {
        Intent c11;
        String str = releaseNoteInfo.details.content;
        if (releaseNoteInfo.fullscreen && str != null) {
            if (str.length() != 0 && gm.b.g(Uri.parse(str))) {
                c11 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            } else {
                c11 = HMWebActivity.f35395c.c(context, context.getString(C1987R.string._UPDATE_APP_ITEM_), str);
            }
            context.startActivity(c11);
        }
    }

    @Override // ww.b.e
    public String getManagedType() {
        return "device";
    }

    @Override // ww.b.e
    public f<TextItemData> getSerializer() {
        return new TextItemData.Serializer();
    }

    @Override // ww.b.e
    public void onTimelineItemDeleted(long j5, TimelineItem<TextItemData> item) {
        u.j(item, "item");
    }

    public final void showChangelogIfNecessary(final Context context, final b timelineManager, final User user) {
        u.j(context, "context");
        u.j(timelineManager, "timelineManager");
        HtmlChangelogHelper.showChangelogIfNecessary(context, APP_NAME, "6040016", new HtmlChangelogHelper.Callback() { // from class: com.withings.wiscale2.settings.changelog.a
            @Override // com.withings.appVersion.changelog.HtmlChangelogHelper.Callback
            public final void showAvailableChangeLog(HtmlChangelogHelper.ReleaseNoteInfo releaseNoteInfo) {
                ChangeLogTimelineDelegate.showChangelogIfNecessary$lambda$0(ChangeLogTimelineDelegate.this, context, user, timelineManager, releaseNoteInfo);
            }
        });
    }

    @Override // ww.b.e
    public boolean softDeleteItem(TimelineItem<TextItemData> item) {
        u.j(item, "item");
        return false;
    }
}
