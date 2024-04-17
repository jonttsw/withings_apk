package com.withings.badge.model;

import androidx.appcompat.app.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: BadgeSection.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/withings/badge/model/BadgeSection;", "", "badgeSectionType", "Lcom/withings/badge/model/BadgeSectionType;", "unlockedBadgeNumber", "", "totalBadgeNumber", "badges", "", "Lcom/withings/badge/model/BadgeModelUI;", "(Lcom/withings/badge/model/BadgeSectionType;IILjava/util/List;)V", "getBadgeSectionType", "()Lcom/withings/badge/model/BadgeSectionType;", "getBadges", "()Ljava/util/List;", "getTotalBadgeNumber", "()I", "getUnlockedBadgeNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "badge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BadgeSection {
    public static final int $stable = 8;
    private final BadgeSectionType badgeSectionType;
    private final List<BadgeModelUI> badges;
    private final int totalBadgeNumber;
    private final int unlockedBadgeNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public BadgeSection(BadgeSectionType badgeSectionType, int i11, int i12, List<? extends BadgeModelUI> badges) {
        u.j(badgeSectionType, "badgeSectionType");
        u.j(badges, "badges");
        this.badgeSectionType = badgeSectionType;
        this.unlockedBadgeNumber = i11;
        this.totalBadgeNumber = i12;
        this.badges = badges;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BadgeSection copy$default(BadgeSection badgeSection, BadgeSectionType badgeSectionType, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            badgeSectionType = badgeSection.badgeSectionType;
        }
        if ((i13 & 2) != 0) {
            i11 = badgeSection.unlockedBadgeNumber;
        }
        if ((i13 & 4) != 0) {
            i12 = badgeSection.totalBadgeNumber;
        }
        if ((i13 & 8) != 0) {
            list = badgeSection.badges;
        }
        return badgeSection.copy(badgeSectionType, i11, i12, list);
    }

    public final BadgeSectionType component1() {
        return this.badgeSectionType;
    }

    public final int component2() {
        return this.unlockedBadgeNumber;
    }

    public final int component3() {
        return this.totalBadgeNumber;
    }

    public final List<BadgeModelUI> component4() {
        return this.badges;
    }

    public final BadgeSection copy(BadgeSectionType badgeSectionType, int i11, int i12, List<? extends BadgeModelUI> badges) {
        u.j(badgeSectionType, "badgeSectionType");
        u.j(badges, "badges");
        return new BadgeSection(badgeSectionType, i11, i12, badges);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeSection)) {
            return false;
        }
        BadgeSection badgeSection = (BadgeSection) obj;
        if (this.badgeSectionType == badgeSection.badgeSectionType && this.unlockedBadgeNumber == badgeSection.unlockedBadgeNumber && this.totalBadgeNumber == badgeSection.totalBadgeNumber && u.e(this.badges, badgeSection.badges)) {
            return true;
        }
        return false;
    }

    public final BadgeSectionType getBadgeSectionType() {
        return this.badgeSectionType;
    }

    public final List<BadgeModelUI> getBadges() {
        return this.badges;
    }

    public final int getTotalBadgeNumber() {
        return this.totalBadgeNumber;
    }

    public final int getUnlockedBadgeNumber() {
        return this.unlockedBadgeNumber;
    }

    public int hashCode() {
        return this.badges.hashCode() + h.a(this.totalBadgeNumber, h.a(this.unlockedBadgeNumber, this.badgeSectionType.hashCode() * 31, 31), 31);
    }

    public String toString() {
        BadgeSectionType badgeSectionType = this.badgeSectionType;
        int i11 = this.unlockedBadgeNumber;
        int i12 = this.totalBadgeNumber;
        List<BadgeModelUI> list = this.badges;
        return "BadgeSection(badgeSectionType=" + badgeSectionType + ", unlockedBadgeNumber=" + i11 + ", totalBadgeNumber=" + i12 + ", badges=" + list + ")";
    }
}
