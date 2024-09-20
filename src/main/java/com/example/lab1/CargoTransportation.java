package com.example.lab1;

import java.util.ArrayList;

public class CargoTransportation implements ReaderExecutor
{
    int roadCount;
    ArrayList<Integer> roadsTunnels = new ArrayList<>();

    public CargoTransportation()
    {}

    public CargoTransportation(int roadCount, ArrayList<Integer> roadsTunnels)
    {
        this.roadCount = roadCount;
        this.roadsTunnels = roadsTunnels;
    }

    // returns number of the best road and it's min heigth
    @Override
    public int[] execute()
    {
        int theHeightestTunnelNumber = 0;
        int minHeightOfTheHeightestTunnel = 0;
        int generalCounter = 0;
        for (int i = 0; i < roadCount; i++)
        {
            int tunnelsCounter = roadsTunnels.get(generalCounter);
            int currentRoadMinHeight = Integer.MAX_VALUE;
            for (int j = 0; j < tunnelsCounter; j++)
            {
                generalCounter++;
                int currentTunnelHeight = roadsTunnels.get(generalCounter);
                if (currentTunnelHeight < currentRoadMinHeight)
                {
                    currentRoadMinHeight = currentTunnelHeight;
                }
            }

            if (currentRoadMinHeight > minHeightOfTheHeightestTunnel)
            {
                minHeightOfTheHeightestTunnel = currentRoadMinHeight;
                theHeightestTunnelNumber = i + 1;
            }
            generalCounter++;
        }

        return new int[]{theHeightestTunnelNumber, minHeightOfTheHeightestTunnel};
    }

    @Override
    public CargoTransportation read()
    {
        roadCount = ReadUtils.readInt();
        for (int i = 0; i < roadCount; i++)
        {
            int tunnelsCount = ReadUtils.readInt();
            this.roadsTunnels.add(tunnelsCount);

            int[] tunnels = ReadUtils.readMultipleInts(tunnelsCount);
            for (Integer tunnel : tunnels)
            {
                this.roadsTunnels.add(tunnel);
            }
        }

        return this;
    }
}
