using Godot;
using Godot.Collections;
using System;

public partial class Main : Node
{
	private PackedScene riftScene;
	public Node2D Rift = new();

	public override void _Ready()
	{
		riftScene = GD.Load<PackedScene>("res://scene/rift.tscn");
		AddChild(riftScene.Instantiate());
		Rift = GetNode<Node2D>("rift");
		Rift.Position = new Vector2(800, 0);
	}
}
