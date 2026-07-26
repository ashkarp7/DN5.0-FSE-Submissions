function ListofPlayers() {

    const players = [
        { name: "Virat", score: 95 },
        { name: "Rohit", score: 85 },
        { name: "Gill", score: 65 },
        { name: "Rahul", score: 78 },
        { name: "Hardik", score: 55 },
        { name: "Jadeja", score: 72 },
        { name: "Ashwin", score: 60 },
        { name: "Shami", score: 80 },
        { name: "Bumrah", score: 68 },
        { name: "Siraj", score: 74 },
        { name: "Kuldeep", score: 82 }
    ];

    const below70 = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>

            {players.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}

            <h2>Players with Score below 70</h2>

            {below70.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}
        </div>
    );
}

export default ListofPlayers;
