import json
stage='19'
data={}
data['width']=10
data['height']=15
data['name']='Hippo mermaid'
data['hints']={}
data['hints']['horizontal']=['3 1 2','1 1 2 2 1','3 2 1 4','1 2 3 1 1','1 1 3 1 1','1 1 2 2','1 2 2 1 1 1','1 1 3 1 1','1 1 1 5','1 1 3']
data['hints']['vertical']=['1 2 3','1 1 1','2 2','6 1','1','1 1 1 1','9','1 3 1','3 2','1 1','1 2 2','2 4','1 4 1','1 1 1 1','2 3']
data['answer']=[]
data['answer'].append([0,1,0,1,1,0,1,1,1,0])
data['answer'].append([0,0,1,0,0,1,0,0,0,1])
data['answer'].append([0,0,1,1,0,0,1,1,0,0])
data['answer'].append([0,1,1,1,1,1,1,0,1,0])
data['answer'].append([1,0,0,0,0,0,0,0,0,0])
data['answer'].append([1,0,1,0,0,0,1,0,0,1])
data['answer'].append([1,1,1,1,1,1,1,1,1,0])
data['answer'].append([0,1,0,1,1,1,0,1,0,0])
data['answer'].append([0,0,1,1,1,0,1,1,0,0])
data['answer'].append([1,0,0,0,0,0,0,0,0,1])
data['answer'].append([0,1,0,1,1,0,0,0,1,1])
data['answer'].append([0,1,1,0,0,0,1,1,1,1])
data['answer'].append([1,0,1,1,1,1,0,0,1,0])
data['answer'].append([1,0,1,0,0,1,0,0,1,0])
data['answer'].append([0,1,1,0,0,0,1,1,1,0])


json.dump(data,open(stage+'.json','w'),sort_keys=True)
