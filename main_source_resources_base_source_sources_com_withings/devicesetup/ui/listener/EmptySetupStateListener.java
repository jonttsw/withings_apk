package com.withings.devicesetup.ui.listener;

import android.os.Parcel;
import android.os.Parcelable;
import com.withings.devicesetup.ui.SetupStateListener;
/* loaded from: classes3.dex */
public class EmptySetupStateListener implements SetupStateListener {
    public static final Parcelable.Creator<EmptySetupStateListener> CREATOR = new Object();

    /* loaded from: classes3.dex */
    final class a implements Parcelable.Creator<EmptySetupStateListener> {
        @Override // android.os.Parcelable.Creator
        public final EmptySetupStateListener createFromParcel(Parcel parcel) {
            return new EmptySetupStateListener();
        }

        @Override // android.os.Parcelable.Creator
        public final EmptySetupStateListener[] newArray(int i11) {
            return new EmptySetupStateListener[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
    }
}
