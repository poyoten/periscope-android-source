// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            Loader

public static final class  extends IOException
{

    public (Exception exception)
    {
        super((new StringBuilder("Unexpected ")).append(exception.getClass().getSimpleName()).append(": ").append(exception.getMessage()).toString(), exception);
    }
}
