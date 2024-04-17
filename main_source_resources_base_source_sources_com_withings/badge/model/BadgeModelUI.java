package com.withings.badge.model;

import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: BadgeModelUI.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/withings/badge/model/BadgeModelUI;", "", NavigationArguments.USER_ID, "", "badgeId", "", "(JLjava/lang/String;)V", "getBadgeId", "()Ljava/lang/String;", "getUserId", "()J", "LockedBadgeModelUI", "UnlockedBadgeModelUI", "Lcom/withings/badge/model/BadgeModelUI$LockedBadgeModelUI;", "Lcom/withings/badge/model/BadgeModelUI$UnlockedBadgeModelUI;", "badge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BadgeModelUI {
    public static final int $stable = 0;
    private final String badgeId;
    private final long userId;

    /* compiled from: BadgeModelUI.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withings/badge/model/BadgeModelUI$LockedBadgeModelUI;", "Lcom/withings/badge/model/BadgeModelUI;", NavigationArguments.USER_ID, "", "badgeId", "", "imageUrl", "title", HealthConstants.FoodInfo.DESCRIPTION, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getImageUrl", "getTitle", "badge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class LockedBadgeModelUI extends BadgeModelUI {
        public static final int $stable = 0;
        private final String description;
        private final String imageUrl;
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockedBadgeModelUI(long j5, String badgeId, String imageUrl, String title, String description) {
            super(j5, badgeId, null);
            u.j(badgeId, "badgeId");
            u.j(imageUrl, "imageUrl");
            u.j(title, "title");
            u.j(description, "description");
            this.imageUrl = imageUrl;
            this.title = title;
            this.description = description;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: BadgeModelUI.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withings/badge/model/BadgeModelUI$UnlockedBadgeModelUI;", "Lcom/withings/badge/model/BadgeModelUI;", NavigationArguments.USER_ID, "", "badgeId", "", "imageUrl", "title", HealthConstants.FoodInfo.DESCRIPTION, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getImageUrl", "getTitle", "badge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class UnlockedBadgeModelUI extends BadgeModelUI {
        public static final int $stable = 0;
        private final String description;
        private final String imageUrl;
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnlockedBadgeModelUI(long j5, String badgeId, String imageUrl, String title, String description) {
            super(j5, badgeId, null);
            u.j(badgeId, "badgeId");
            u.j(imageUrl, "imageUrl");
            u.j(title, "title");
            u.j(description, "description");
            this.imageUrl = imageUrl;
            this.title = title;
            this.description = description;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    public /* synthetic */ BadgeModelUI(long j5, String str, m mVar) {
        this(j5, str);
    }

    public final String getBadgeId() {
        return this.badgeId;
    }

    public final long getUserId() {
        return this.userId;
    }

    private BadgeModelUI(long j5, String str) {
        this.userId = j5;
        this.badgeId = str;
    }
}
