package com.withings.webservices.legacy.sync;

import com.withings.webservices.legacy.lastupdate.LastUpdate;
/* loaded from: classes4.dex */
public interface SyncAction extends vh.a {

    /* loaded from: classes4.dex */
    public interface WithSyncContext extends SyncAction {
        @Override // com.withings.webservices.legacy.sync.SyncAction, vh.a
        /* synthetic */ void run() throws Exception;

        void setSyncContext(String str);
    }

    boolean needsLastUpdate();

    @Override // vh.a
    /* synthetic */ void run() throws Exception;

    void setLastUpdate(LastUpdate lastUpdate);
}
