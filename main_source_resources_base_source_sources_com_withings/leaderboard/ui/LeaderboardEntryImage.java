package com.withings.leaderboard.ui;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.withings.common.compose.component.AvatarSize;
import com.withings.common.compose.component.c;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: LeaderboardEntryImage.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/withings/leaderboard/ui/LeaderboardEntryImage;", "", "Landroidx/compose/ui/platform/ComposeView;", "Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "entry", "Lcom/withings/common/compose/component/AvatarSize;", "size", "", "textColor", "backgroundColor", "Lnm0/y;", "setImageForLeaderboardEntry", "(Landroidx/compose/ui/platform/ComposeView;Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;Lcom/withings/common/compose/component/AvatarSize;II)V", "<init>", "()V", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardEntryImage {
    public static final int $stable = 0;
    public static final LeaderboardEntryImage INSTANCE = new LeaderboardEntryImage();

    private LeaderboardEntryImage() {
    }

    public static final void setImageForLeaderboardEntry(ComposeView composeView, LeaderboardEntry entry, AvatarSize size) {
        u.j(composeView, "<this>");
        u.j(entry, "entry");
        u.j(size, "size");
        setImageForLeaderboardEntry$default(composeView, entry, size, 0, 0, 12, null);
    }

    public static /* synthetic */ void setImageForLeaderboardEntry$default(ComposeView composeView, LeaderboardEntry leaderboardEntry, AvatarSize avatarSize, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            Context context = composeView.getContext();
            u.i(context, "getContext(...)");
            i11 = ah.u.w(16842806, context, -65281);
        }
        if ((i13 & 8) != 0) {
            Context context2 = composeView.getContext();
            u.i(context2, "getContext(...)");
            i12 = ah.u.w(16842801, context2, -65281);
        }
        setImageForLeaderboardEntry(composeView, leaderboardEntry, avatarSize, i11, i12);
    }

    public static final void setImageForLeaderboardEntry(ComposeView composeView, LeaderboardEntry entry, AvatarSize size, int i11) {
        u.j(composeView, "<this>");
        u.j(entry, "entry");
        u.j(size, "size");
        setImageForLeaderboardEntry$default(composeView, entry, size, i11, 0, 8, null);
    }

    public static final void setImageForLeaderboardEntry(ComposeView composeView, LeaderboardEntry entry, AvatarSize size, int i11, int i12) {
        u.j(composeView, "<this>");
        u.j(entry, "entry");
        u.j(size, "size");
        String firstname = entry.getFirstname();
        String lastName = entry.getLastName();
        String imageUrl = entry.getImageUrl();
        if (imageUrl == null) {
            imageUrl = "no-url";
        }
        long millis = entry.getModified().getMillis();
        c.f(composeView, firstname, lastName, imageUrl + "?modified=" + millis, size, Integer.valueOf(i12), Integer.valueOf(i11), false, null, 192);
    }
}
