// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            RC5

public static class hmParameters extends IvAlgorithmParameters
{

    protected String engineToString()
    {
        return "RC5 IV";
    }

    public hmParameters()
    {
    }
}
