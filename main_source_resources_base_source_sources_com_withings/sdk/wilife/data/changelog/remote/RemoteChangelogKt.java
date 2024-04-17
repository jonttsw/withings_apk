package com.withings.sdk.wilife.data.changelog.remote;

import com.withings.sdk.wilife.data.changelog.Changelog;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: RemoteChangelog.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"convertToChangeLog", "Lcom/withings/sdk/wilife/data/changelog/Changelog;", "Lcom/withings/sdk/wilife/data/changelog/remote/RemoteChangelog;", "wilife-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RemoteChangelogKt {
    public static final Changelog convertToChangeLog(RemoteChangelog remoteChangelog) {
        u.j(remoteChangelog, "<this>");
        return new Changelog(remoteChangelog.getChangelog());
    }
}
